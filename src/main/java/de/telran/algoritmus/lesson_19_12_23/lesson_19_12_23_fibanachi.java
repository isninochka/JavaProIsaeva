package de.telran.algoritmus.lesson_19_12_23;

public class lesson_19_12_23_fibanachi {

    public static int progression(int n){
        if (n<=0) throw new Error("the number should be positive");
        if (n == 1) return 1;
        return progression(n - 1) + n;
    }
    public static int fibRecurs(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibRecurs(n-1)+ fibRecurs(n-2);
        }

    }

    public static int sumEl(int n) {
        if (n <= 0) throw new Error("the number should be positive");
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void fibanachi(int n){
        int a =0;
        int b =1;
        for (int i = 3; i <= n; ++i) {
            int res = a+b;
            a = b;
            b =res;
            System.out.println(res);
        }
    }


    public static void main(String[] args) {
        System.out.println(fibRecurs(5));
        fibanachi(5);
        System.out.println(progression(5));
        System.out.println(sumEl(6));


    }


}

