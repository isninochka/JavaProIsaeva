package de.telran.prakticaJavaRush.Nov30_11.Arrays;

public class MatrixMultiplication {

    public static void main(String[] args) {


    //объявляем две матрицы
    int [][] twoDimArray1 = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
    int[][] twoDimArray2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};

    //процесс умножения матриц
    int [][] twoDimArray3 = new int [twoDimArray1.length][twoDimArray2[0].length];
        for (int i = 0; i < twoDimArray3[0].length; i++) {
            for (int j = 0; j < twoDimArray3.length; j++) {
                for (int k = 0; k < twoDimArray1[0].length; k++) {
                    twoDimArray3[i][j]=twoDimArray3[i][j]+twoDimArray1[i][k]*twoDimArray2[k][j];
                }
            }
        }


//вывод на экран
        for (int[] ints : twoDimArray3) {
            for (int j = 0; j < twoDimArray3[0].length; j++) {
                System.out.print(" " + ints[j] + " ");
            }
            System.out.println();
        }
    }
}
