package de.telran.prakticaJavaRush.Nov30_11.Arrays;

import java.util.Arrays;

public class Chess {

    public static void chessBoardPaint(String[][]chessBoard){
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";

            }
        }
    }

    public static void chessBoardCreateCoord(String[][]chessBoard){
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W" + chessBoardCoord(j, i);
                else chessBoard[i][j] = "B" + chessBoardCoord(j, i);
            }
        }

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static String chessBoardCoord(int a, int b){
        String letters = "abclefghij";
        String numbers = "12345678910";

        if (a > 7 || b > 7)
            return null;
        else return (Character.toString(letters.charAt(a))+numbers.charAt(b));



    }


    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        chessBoardPaint(chessBoard);
        chessBoardCreateCoord(chessBoard);





        }








    }

