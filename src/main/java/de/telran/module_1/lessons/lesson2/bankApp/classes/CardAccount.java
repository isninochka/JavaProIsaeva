package de.telran.module_1.lessons.lesson2.bankApp.classes;

import de.telran.module_1.lessons.lesson2.bankApp.interfaces.admins.AdminCard;
import de.telran.module_1.lessons.lesson2.bankApp.interfaces.Owner;

import java.time.LocalDate;

public class CardAccount extends ClientAccount implements Owner, AdminCard {

    double sizeOverdraft;

    public CardAccount(String accountOwner, String accountNumber, double balance, double sizeOverdraft) {
        super(accountOwner, accountNumber, balance);
        this.sizeOverdraft = sizeOverdraft;
    }


    @Override
    public void withdraw(double sum) {
        if ((sizeOverdraft + balance) >= sum ) {
            balance -= sum;
            System.out.println("Возьмите ваши деньги. Остаток денежных средств на вашем карточном счете " +(balance));
        } else {
            System.out.println("Транзакция не возможна. Не достаточно средств.");
        }
    }

    @Override
    public void deposit(double sum) {
        balance += sum;
        System.out.println("Вы пополнили счет на "+sum +". Текущий баланс "+(balance));
    }
    @Override
    public void closeAccount(LocalDate closedDate) {

    }

    @Override
    public double getMaxDeposit() {
        return 0;
    }

    @Override
    public double getMaxWithdrawSum() {
        return 0;
    }

    @Override
    public void setMaxWithdrawSum() {

    }

    @Override
    public double getSizeOverdraft() {
        return 0;
    }

    @Override
    public void setSizeOverdraft(double sum) {

    }

    @Override
    public String getStatus() {
        return null;
    }
}
