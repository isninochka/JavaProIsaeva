package de.telran.homeWorks.homeWork17_11_23.task_3;

public interface Cachier {
    default void sumInvoice(double sum){
        System.out.println("Сумма вашего счета "+ sum);
    }
    default void acceptPay(double sum) {
        System.out.println("К оплате " + sum);
    }
}
