package de.telran.module_1.lessons.lesson2.bankApp.interfaces;

public interface Cashier {
    void deposit(double sum);
    void withdraw(double sum);
    double getBalance();
}
