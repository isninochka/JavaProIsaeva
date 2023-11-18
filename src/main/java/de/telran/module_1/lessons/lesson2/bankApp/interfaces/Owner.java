package de.telran.module_1.lessons.lesson2.bankApp.interfaces;

import java.time.LocalDate;

public interface Owner extends Cashier{
    void closeAccount(LocalDate closedDate);
    double getBalance();
    double getMaxDeposit();
    double getMaxWithdrawSum();
    void setMaxWithdrawSum();
    double getSizeOverdraft();



}
