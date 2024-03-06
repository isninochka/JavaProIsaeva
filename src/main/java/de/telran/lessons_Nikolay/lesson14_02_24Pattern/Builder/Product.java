package de.telran.lessons_Temnyakov.lesson14_02_24Pattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
private List<String> parts = new ArrayList<>();
public void add(String part){
    this.parts.add(part);
}
public void show(){
    parts.stream().forEach(System.out::println);
}
}
