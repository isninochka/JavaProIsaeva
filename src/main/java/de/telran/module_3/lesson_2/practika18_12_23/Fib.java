package de.telran.module_3.lesson_2.practika18_12_23;

public class Fib {

    public static void main(String[] args) {
        fibLOOP(10);

    }
    public static int fibLOOP(final int idx){

        int a =0;
        int b =1;
        for (int i = 0; i <= idx; ++i) {
            int res = a+b;
            a = b;
            b =res;
            System.out.println(res);
        }


        return 0;
    }
}
