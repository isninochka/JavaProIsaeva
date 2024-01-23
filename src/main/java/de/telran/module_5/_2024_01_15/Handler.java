package de.telran.module_5._2024_01_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Handler {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        try {
            File file = new File("report.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //System.out.println(line);

                String regex = "\\[\\(CATEGORY\\)(\\w+)#(\\d+)\\]\\[(\\w+\\s*[A-Za-z'-]*\\w*\\w*)#(\\d+)\\]\\[(\\w+\\s*[A-Za-z'-]*\\s*\\w*)#(\\d+)\\]\\[(\\d+)#" +
                        "(\\d+)\\]\\[(\\w+)#(\\d+)\\]\\[(\\w+)#(\\d+)\\]\\[(\\d+.\\d+)#(\\d+)\\]\\[(\\d+.\\d+)#(\\d+\\d*)\\]\\[(\\w+)#(\\d+)\\]";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(line);
                Product product = new Product();


                while (matcher.find()) {

                    product.setId(Integer.parseInt(matcher.group(2)));
                    product.setCategory(Category.valueOf(matcher.group(1)));
                    product.setName(matcher.group(3));
                    product.setFactory(matcher.group(5));
                    product.setQuantity(Integer.parseInt(matcher.group(7)));
                    product.setPacked(Boolean.parseBoolean(matcher.group(9)));
                    product.setAdv(Boolean.parseBoolean(matcher.group(11)));
                    product.setPrice(Double.parseDouble(matcher.group(13)));
                    product.setMargin(Double.parseDouble(matcher.group(15)));
                    product.setDebt(Boolean.parseBoolean(matcher.group(17)));

                    products.add(product);

                }
            }

            for (Product p : products) {
                System.out.println(p);
            }

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("Method-> ай ди всех компаний");
        System.out.println(productsID(products));

        System.out.println("Method-> самый дорогой СНЭК");
        System.out.println(mostExpSnack(products));

        System.out.println("Method-> какого товара больше всего на складе в деньгах");
        System.out.println(mostExpQProd(products));

        System.out.println("Method->  какого  ДРИНКС товара меньше всего на складе в деньгах");
        System.out.println(minDrinkQPrice(products));

        System.out.println("Method->  количество видов акционного товара у ФУД");
        System.out.println(countFoodSale(products));

        System.out.println("Method->  сгруппировать по упакованным и нет");
        System.out.println("packed: " + groupByPack(products).get(true));
        System.out.println("unpacked: " + groupByPack(products).get(false));

        System.out.println("Method->  у какого ДРИНКС самая высокая маржа");
        System.out.println(biggestMarginFromDrinks(products));

        System.out.println("Method-> средняя маржа по категории");
        System.out.println(averageMarginByCategory(Category.FOOD, products));
        System.out.println(averageMarginByCategory(Category.DRINKS,products));
        System.out.println(averageMarginByCategory(Category.SNACKS,products));

        System.out.println("Method-> первые три товара ФУД которые участвуют в акции и у которых самая низкая маржа");
        System.out.println(promoFoodWithMinMargin(3,products));

        System.out.println("Method-> поместить в три мапу отсортировав в ай ди. #37 - это ай ди");
        System.out.println(toMapById(products));

        System.out.println("Method-> самый дешевый товар которого меньше всего на складе осталось в кг или штуках в зависимости от ISPACKED");
        System.out.println(cheapestByQuantity(products));
    }

    private static List<Integer> productsID(List<Product> products) {
        List<Integer> listId = products.stream()
                .map(Product::getId)
                .collect(Collectors.toList());
        return listId;
    }

    private static Product mostExpSnack(List<Product> products) {
        Product mostExpSnack = null;
        double maxPrice = 0;
        for (Product p : products) {
            if (p.getCategory().equals(Category.SNACKS) && p.getPrice() > maxPrice) {
                mostExpSnack = p;
                maxPrice = p.getPrice();
            }
        }
        return mostExpSnack;
    }

    private static Product mostExpQProd(List<Product> products) {
        Product maxValue = null;
        double mostExpQProd = 0;

        for (Product p : products) {
            double maxValuePrice = p.getPrice() * p.getQuantity();
            if (maxValuePrice > mostExpQProd) {
                maxValue = p;
                mostExpQProd = maxValuePrice;
            }

        }
        return maxValue;

    }

    private static Product minDrinkQPrice(List<Product> products) {
        Product minDrinkQPrice = null;
        double min = Double.MAX_VALUE;

        for (Product p : products) {
            double quanPrice = p.getPrice() * p.getQuantity();
            if (p.getCategory().equals(Category.DRINKS) && quanPrice < min) {
                minDrinkQPrice = p;
                min = quanPrice;
            }

        }
        return minDrinkQPrice;

    }

    private static int countFoodSale(List<Product> products) {
        int count = 0;
        for (Product p : products) {

            if (p.getCategory().equals(Category.FOOD) && p.isAdv()) {
                count++;
            }
        }
        return count;

    }

    private static Map<Boolean, List<Product>> groupByPack(List<Product> products) {
        return products.stream()
                .collect(Collectors.partitioningBy(Product::isPacked));
    }

    private static Product biggestMarginFromDrinks(List<Product> products) {
        double margin = 0;
        Product bigMargin = null;

        for (Product p : products) {
            double maxMargin = p.getMargin();
            if (maxMargin > margin && p.getCategory().equals(Category.DRINKS)) {
                margin = maxMargin;
                bigMargin = p;
            }
        }
        return bigMargin;
    }

    private static OptionalDouble averageMarginByCategory(Category category, List<Product> products) {
    return products.stream()
            .filter(p->p.getCategory().equals(category))
            .mapToDouble(Product::getMargin)
            .average();
    }

    private static List<Product> promoFoodWithMinMargin(int limit, List<Product> products) {
        List<Product> promoFood = new ArrayList<>();
        for (Product p : products) {
            if (p.getCategory().equals(Category.FOOD) && p.getMargin() > 0 && promoFood.size() < limit) {
                promoFood.sort(Comparator.comparingDouble(Product::getMargin));
                promoFood.add(p);

            }

        }
        return promoFood;
    }

    private static Map<Integer, Product> toMapById(List<Product> products){
        Map<Integer,Product> productMap = new TreeMap<>();
        for (Product p: products) {
            productMap.put(p.getId(),p);
        }
        return productMap;
    }

    private static Product cheapestByQuantity(List<Product> products){
        Product cheapest = null;
        double minPrice = Double.MAX_VALUE;


        for (Product p:products) {
            if (p.isPacked() == true && p.getQuantity() < minPrice){
                cheapest = p;
                minPrice = p.getPrice();
            }

        }
        return cheapest;
    }
}
