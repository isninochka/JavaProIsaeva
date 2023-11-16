package de.telran.homeWorks.homeWork10_11_23.exercise_4;


public class Box {

    private int width;
    private int length;
    private  int height;

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int volumeCalc(){
        return width*length*height;
    }

    public int needBoxes(int productVolume){
        int oneBoxVolume = volumeCalc();
        if (oneBoxVolume <= 0 || productVolume <=0){
            System.out.println("Введены не корректные данные");
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
