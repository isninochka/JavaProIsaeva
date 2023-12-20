package de.telran.module_3.lesson_2.lesson_3;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class SimpleRefMethods {
    public static void main(String[] args) {
        List<Integer>list= List.of(1,3,5,2,8,9);
        list.forEach((el)-> System.out.println(el));
        list.forEach(System.out::println);
        Function<String,Integer> toInteger = s -> parse(s);
        Integer integer = toInteger.apply("5");
        Function<String,Integer> toInteger1 = SimpleRefMethods::parse;
        integer = toInteger1.apply("10");
        BiFunction<String,String,Integer> biFunction = SimpleRefMethods::sum;
        System.out.println(biFunction.apply("5","15"));
        UserFactory userFactory = User::new;
        userFactory.create("Ivan","Ivanov");
        BiFunction<String,String,User> userBiFunction = User::new;
        userBiFunction.apply("Sergey","Sergeev");

        Function<String,String> trim = String::trim;
        String str = trim
                .andThen(String::toLowerCase)
                .andThen(StringBuilder::new)
                .andThen(StringBuilder::reverse)
                .andThen(StringBuilder::toString)
                .apply("ABCDEFG");
        System.out.println(str);


    }
    private static Integer parse(String s){
        return Integer.parseInt(s);
    }
    private static Integer sum(String s1, String s2){
        return Integer.parseInt(s1)+Integer.parseInt(s2);
    }
}
@AllArgsConstructor
class User{
    String name, surname;

}
@FunctionalInterface
interface UserFactory{
    User create(String name, String surname);
}
