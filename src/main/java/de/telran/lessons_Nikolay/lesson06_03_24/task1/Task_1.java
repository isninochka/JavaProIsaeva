package de.telran.lessons_Nikolay.lesson06_03_24.task1;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/*## Задание:
        1) Решить задачу с помощью Stream API или императивно:
Input : 1, 2, 5, 4, 4, 5, 2, 3, 6, 5 Output:
Map<String, Integer>
<"1-hello": 1>,
<"2-hello": 2>,
<"3-hello": 1>,
<"5-hello": 3>


public static Map<String, Long> transform(final Integer... nums) {
    result;
}

 */
public class Task_1 {
    public static void main(String[] args) {
        Integer[]nums = {1, 2, 5, 4, 4, 5, 2, 3, 6, 5};
        Map<String,Long> newMap = transform(nums);
        System.out.println(newMap);
    }
    public static Map<String, Long> transform(final Integer... nums) {
        return Arrays.stream(nums)
                .map(n->n+"-hello")
                .collect(Collectors.groupingBy(String::toString,Collectors.counting()));

    }

}
