package de.telran.module_1.lessons.lesson2.bankApp.classes;

import de.telran.module_1.lessons.lesson2.bankApp.interfaces.admins.Admin;
import de.telran.module_1.lessons.lesson2.bankApp.interfaces.admins.AdminCredit;
import de.telran.module_1.lessons.lesson2.bankApp.interfaces.Cashier;
import de.telran.module_1.lessons.lesson2.bankApp.interfaces.Owner;

public class BankDemo {
    public static void main(String[] args) {


DepositAccount depositAccount = new DepositAccount("Ivan Ivanov", "12345678912345678",
        2000,3000);
CreditAccount creditAccount = new CreditAccount("Ivan Ivanov", "12345678912000000",
        100, 800,500);
CardAccount cardAccount = new CardAccount("Ivan Ivanov", "12345678912111111", 600,
        400);

depositAccount.deposit(300);

creditAccount.withdraw(600);

cardAccount.withdraw(700);

        ((Cashier) depositAccount).withdraw(200);

        ((Cashier) cardAccount).getBalance();
        ((Cashier) creditAccount).deposit(2000);

        ((Owner) cardAccount).withdraw(1500);
        ((Owner) creditAccount).deposit(200);

        ((Admin) depositAccount).setStatus("Закрыт");
        System.out.println(depositAccount.getStatus());

        ((AdminCredit) creditAccount).setMaxWithdraw(3000);















    }
}
