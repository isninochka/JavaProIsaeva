package de.telran.module_5;
import java.util.Arrays;
import java.util.Random;

public class InselSearch{
    public static void main(String[] args) {
        Random random = new Random();
        int[][] twoDimArr = new int[10][10];

        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[0].length; j++) {
                twoDimArr[i][j]= random.nextInt(2);
            }
        }
        for (int[] arr: twoDimArr) {
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Самый большой остров содержит " + maxInselFinder(twoDimArr)+ " единиц");


    }

    private static int islandsFinder(int[][] twoDimArr, int row, int col){
        if(row < 0 || twoDimArr.length <= row || col < 0 || twoDimArr[0].length <= col || twoDimArr[row][col] == 0){
            return 0;
        }

        twoDimArr[row][col] = 0;
        int count = 1;

        count += islandsFinder(twoDimArr,row,col-1);
        count += islandsFinder(twoDimArr,row,col+1);
        count += islandsFinder(twoDimArr,row-1,col);
        count += islandsFinder(twoDimArr,row+1,col);
        return count;
    }

    private static int maxInselFinder(int[][] twoDimArr){
        int maxInsel = 0;
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[0].length; j++) {

                if (twoDimArr[i][j] ==1){
                    maxInsel = Math.max(maxInsel,islandsFinder(twoDimArr,i,j));

                }

            }
        }

        return maxInsel;
    }
}

//class PaintSimbols extends JPanel{
//    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        frame.setSize(600,600);
//        frame.getContentPane().add(new PaintSimbols());
//        frame.setLocationRelativeTo(null);
//        frame.setBackground(Color.gray);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//
//    public void paint (Graphics g){
//        g.fillRect(100,100,400,400);
//        g.clearRect(100,100,50,50);
//
//        for (int i = 100; i <= 400; i+=100) {
//            for (int j = 100; j <= 400 ; j+=100) {
//                g.clearRect(i, j,50,50);
//            }
//
//        }
//        for (int i = 150; i <= 450; i+=100) {
//            for (int j = 150; j <= 450 ; j+=100) {
//                g.clearRect(i, j,50,50);
//            }
//
//        }
//
//    }
//}
