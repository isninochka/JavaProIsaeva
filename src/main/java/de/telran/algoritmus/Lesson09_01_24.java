package de.telran.algoritmus;

public class Lesson09_01_24 {
    public static void main(String[] args) {

    }

    public static int sumEl(int n) {
        if (n <= 0) throw new Error("the number should be positive");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }


    public static int sumElRecurs(int n){
        if (n<=0) throw new Error("the number should be positive");
        if (n == 1) return 1;
        return sumElRecurs(n - 1) + n;
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
    public static int fibRec(int n){
        if (n<=0) throw new Error("the number should be positive");
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    public static void fib(int n){
        int a = 0;
        int b = 1;
        for ( int i = 3; i<=n; i++) {
            int res = a+b;
            a = b;
            b = res;

        }
    }
    public static int binarySearch(int[]arr, int num){
        int start = 0;
        int end = arr.length-1;
        while (end>= start){
            int mid = (start+end)/2;
            if(num >arr[mid]) {
                start = mid + 1;
            }else if (num <arr[mid]){
                end = mid-1;
            }else
                return mid;
        }
        return-1;
    }

    }

