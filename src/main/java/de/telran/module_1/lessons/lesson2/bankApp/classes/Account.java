package de.telran.module_1.lessons.lesson2.bankApp.classes;

import de.telran.module_1.lessons.lesson2.bankApp.interfaces.Cashier;

import java.time.LocalDate;

public abstract class Account  implements Cashier {
    protected String accountNumber;
    protected double balance;
    protected String status;
    protected LocalDate openedDate;
    protected LocalDate closedDate;

    public Account(String accountNumber, double balance) {
    }


//public String checkAccountNumber(){
//    if(accountNumber.length() == 16){
//        return accountNumber;
//    } else {
//        System.out.println("Неправильно введен номер счета!");
//    }
//    return accountNumber;
//}

    public void setStatus(String status) {
        if (status.equals("Открыт") || status.equals("Закрыт") || status.equals("Заморожен")) {
            this.status = status;
        } else {
            System.out.println("Не корректно введен статус.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void closeAccount(LocalDate closedDate) {
        if (balance == 0) {
            this.status = "Закрыт";
            this.closedDate = closedDate;
            System.out.println("Ваш аккаунт закрыт");
        } else {
            System.out.println("Невозможно закрыть аккаунт");
        }
    }
}


