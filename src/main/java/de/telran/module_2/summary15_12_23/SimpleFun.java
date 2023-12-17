package de.telran.module_2.summary15_12_23;

public class SimpleFun {
    public static void main(String[] args) {
        simpleDoWork(new SimpleFunClass());
        simpleDoWork(new SimpleFunInterface() {
            @Override
            public void doWork() {
                System.out.println("AnonymClass: doWork");
            }
        });
        SimpleFunInterface siIn = new SimpleFunClass();
        simpleDoWork(siIn);

        simpleDoWork(() -> System.out.println("Lamda: doWork"));

    }
    public static void simpleDoWork(SimpleFunInterface si){
        si.doWork();

    }
}
class SimpleFunClass implements SimpleFunInterface{

    @Override
    public void doWork() {
        System.out.println("SimpleFunClass: doWork");
    }
}
