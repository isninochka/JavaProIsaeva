package de.telran.module_5._2024_01_15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Handler {
    public static void main(String[] args) throws IOException {


        List<String> productList = new ArrayList<>();
        File report = new File("report.txt");
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
                productList.add(stringFromReport);
            }
        for (String str : productList){
            System.out.println(str);
        }

    }
}
