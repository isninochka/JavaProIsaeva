package de.telran.algoritmus.lesson_19_12_23;

public class lesson_binarySearch {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,18,21};
        int num = 6;
        if(binarySearch(arr,num)==-1){
        System.out.println("the number you're looking for is not here");
        }else{
            System.out.println(binarySearchRecurs(arr,num,0,arr.length-1));}

        System.out.println(hanoi(4,"start","middle","end"));
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
    public static int binarySearchRecurs(int[]arr, int num, int start,int end){
        int mid = (start+end)/2;
        if (start>end){
            System.out.println("the number you're looking for is not here");
        }if(num>arr[mid]){
            return binarySearchRecurs(arr, num, mid+1,end);
        }else if (num<arr[mid]){
                return binarySearchRecurs(arr,num,start, mid-1);

        }else return mid;
    }
    public static String hanoi(int n,String start, String middle, String end){
        if(n==1) return start + end + " ";
        return hanoi(n-1,start,middle,end)+start+end+" "+hanoi(n-1,middle,end,start);
    }
}
