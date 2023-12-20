package de.telran.module_3.lesson_2;

import java.util.List;
import java.util.function.*;

public class SimpleStandartFunctionInterface {
    public static void main(String[] args) {
        Predicate<Integer>predicate = (temperature)-> temperature >= -30;
        Predicate<Integer>predicate2 = (temperature)-> temperature < -30 ? false : true;
        System.out.println(predicate.test(-15));
        System.out.println(predicate2.test(-31));
        System.out.println();
        predicate2 = (weight) -> weight < 15;
        System.out.println(predicate2.test(20));
        System.out.println(predicate2.test(10));

        BiPredicate<Integer,Double>biPredicate = (i,d)-> i >= d;
        System.out.println(biPredicate.test(4,2.01));

        Consumer<Integer> consumer = (t)-> System.out.println(t>15?"warm":"cold");
        consumer.accept(20);
        BiConsumer<Integer,Integer> biConsumer =
                (weight, auto)->
                    System.out.println((weight > auto) ? " not for this auto": " ok, for this auto");

        biConsumer.accept(10,5);
        biConsumer.accept(10,20);

        Function<Integer,String> function = (i) -> String.format(" Street temperatur = %d",i);
        System.out.println(function.apply(20));

        BiFunction<Integer,Double,String> biFunction = (weigth,d) ->(weigth<=d)?"Ok, wtéight is good":"Sorry, weight is too much";
        System.out.println(biFunction.apply(100,80.5));

        UnaryOperator<Integer> unaryOperator = (i)->i*i; // если одинаковые параметры передаются и принимаются, то унарный оператор
        System.out.println("Квадрат числа 5 равен "+unaryOperator.apply(5));

        List<Integer> lists = List.of(1,2,3,4,5,6);
        System.out.println(lists);
        lists.forEach((el)-> System.out.print(el+", "));
        lists.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer e) {
                System.out.print(e+", ");
            }
        });



    }
}
