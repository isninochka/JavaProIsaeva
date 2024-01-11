package de.telran.module_4.lesson08_01_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestMethodGeneric{
    public static void main(String[] args) {
        List list = Arrays.asList("Autor", "Book");
        for (Object el:list) {
            String data = Utils.getValue(el);
            System.out.println(data);
            System.out.println(Utils.<String>getValue(el));
            System.out.println(Utils.getValue(el, String.class));

        }
        Test<List<Integer>> testList = new Test<>();
        testList.set(Arrays.asList(1,2,3,5));
        System.out.println(testList.get());

        Test<int[]> testArrInt = new Test<>();
        int[] arrInt = {5,4,3,2,1};
        testArrInt.set(arrInt);
        System.out.println(Arrays.toString(testArrInt.get()));

        List<Utils> utils = new ArrayList<>();
        utils.sort(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });

        String string =  (String) new Object();

    }
}

class Utils{
    public static <T> T getValue(Object obj){
        return (T) obj;
    }
    public static <T> T getValue(Object obj, Class<T> clazz){
        return (T) obj;
    }

}

