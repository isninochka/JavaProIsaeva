package de.telran.module_5._2024_01_15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Handler {
    public static void main(String[] args) throws IOException {


        List<String> productList = new ArrayList<>();
        File report = new File("report.txt");
        Product product = new Product();
        BufferedReader reader;
        {
            try {
                reader = new BufferedReader(new FileReader(report));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }


        String stringFromReport;
        while ((stringFromReport = reader.readLine()) != null) {
            String regex = "\\[(CATEGORY)\\[(\\w+)#(\\d+)\\[(\\w+)#(\\d+)\\[(\\w+)#(\\d+)\\[(\\d+)#(\\d+)" +
                    "\\[(\\w+)#(\\d+)\\[(\\w+)#(\\d+)\\[(\\d+\\.\\d+)#(\\d+)\\((\\d+\\.\\d+)#(\\d)\\[(\\w+)#(\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(stringFromReport);


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

                productList.add(String.valueOf(product));

                System.out.println(productList);

            }
            for (String str : productList) {
                System.out.println(str);
            }


        }
    }
}
