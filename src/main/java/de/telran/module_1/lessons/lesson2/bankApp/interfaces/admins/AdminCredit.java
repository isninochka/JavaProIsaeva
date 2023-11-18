package de.telran.module_1.lessons.lesson2.bankApp.interfaces.admins;

public interface AdminCredit extends Admin {
    void setCreditLimit(double sum);
    void setMaxWithdraw(double sum);
}
