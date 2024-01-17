package de.telran.module_5._2024_01_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HandlerNew {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        try{
            File file = new File("report.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                line = line.substring(1, line.length() - 1);
                String regex = "\\[(CATEGORY)\\[(\\w+)#(\\d+)\\[(\\w+)#(\\d+)\\[(\\w+)#(\\d+)\\[(\\d+)#(\\d+)" +
                     "\\[(\\w+)#(\\d+)\\[(\\w+)#(\\d+)\\[(\\d+\\.\\d+)#(\\d+)\\((\\d+\\.\\d+)#(\\d)\\[(\\w+)#(\\d+)";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(line);
                Product product = new Product();

                while (matcher.find()) {

                    product.setId(Integer.parseInt(matcher.group(3)));
                    product.setCategory(new Category[]{Category.valueOf(matcher.group(2))});
                    product.setName(matcher.group(4));
                    product.setFactor(new Factor[]{Factor.valueOf(matcher.group(6))});
                    product.setQuantity(Integer.parseInt(matcher.group(8)));
                    product.setPacked(Boolean.parseBoolean(matcher.group(10)));
                    product.setAdv(Boolean.parseBoolean(matcher.group(12)));
                    product.setPrice(Double.parseDouble(matcher.group(14)));
                    product.setMargin(Double.parseDouble(matcher.group(16)));
                    product.setDebt(Boolean.parseBoolean(matcher.group(18)));

                    products.add(product);

                    System.out.println(products);
                }
            }
            scanner.close();

            } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        List<Integer> listId = products.stream()
                .map(Product::getId)
                .collect(Collectors.toList());
        System.out.println(listId);

    }
  }
