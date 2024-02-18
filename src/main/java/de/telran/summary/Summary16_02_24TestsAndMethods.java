package de.telran.summary;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Summary16_02_24TestsAndMethods {
    public static void main(String[] args) {
        int[] arr = {2,5,8,4,9,1};
        //System.out.println(findMax(arr));
        //getTime(arr);

        List<Integer> arrayList = new ArrayList<>(List.of(1, 3, 5, 7));
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(-7);
        list.add(8);
        list.add(11);


//        boolean isAdd = isAddEl(list,7);
//        System.out.println(isAdd);

        System.out.println(arrayLength(arrayList));
    }

    public static int arrayLength(List<Integer> list){
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            counter++;

        }
        return counter;

    }

    public static boolean isAddEl(List<Integer>arr, int el){
        if(arr.size() <5){
            arr.add(el);
            return true;
        } else {
            return false;
        }
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] >max){
                max = arr[i];
            }
          }
        return max;
    }

    public static void getTime(int[] arr){
        Timestamp start = Timestamp.from(Instant.now());
        findMax(arr);
        Timestamp end = Timestamp.from(Instant.now());
        System.out.println(start.getTime()- end.getTime());

    }
}
