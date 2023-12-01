package de.telran.module_2.praktika27_11_23;

public class Task1Demo {

    public static boolean searchNumberFromMatrix(int[][] matrix, int searchNum){

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0;
        int j = n - 1;

        while (i < m && j >= 0) {
            if (matrix[i][j] == searchNum) {
                return true;
            }

            else if (matrix[i][j] > searchNum) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }



    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4},
                {5, 11, 15, 16},
                {9, 12, 17, 21},
                {13, 15, 18, 26},
                {35, 38, 45, 66},
                {78, 89, 99, 100}};









    }
}