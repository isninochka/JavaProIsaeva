package de.telran.module_1.lessons.lesson2.interface1;

public interface IosApp extends App{

    void verifyAppStore();
    default int sum(int a, int b){
        return sumAll(a,b);
    }
    private  int sumAll(int... values){
        int result = 0;
        for (int val: values) {
            result += val;

        }
        return result;
    }
}
