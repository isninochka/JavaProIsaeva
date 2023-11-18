package de.telran.module_1.lessons.lesson2.bankApp.classes;

import de.telran.module_1.lessons.lesson2.bankApp.interfaces.admins.AdminCredit;
import de.telran.module_1.lessons.lesson2.bankApp.interfaces.Owner;

import java.time.LocalDate;

public class CreditAccount extends ClientAccount implements Owner, AdminCredit {
    protected double creditLimit;
    protected double maxWithdrawSum;

    public CreditAccount(String accountOwner, String accountNumber, double balance, double creditLimit, double maxWithdrawSum) {
        super(accountOwner, accountNumber, balance);
        this.creditLimit = creditLimit;
        this.maxWithdrawSum = maxWithdrawSum;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void closeAccount(LocalDate closedDate) {

    }

    @Override
    public double getMaxDeposit() {
        return 0;
    }

    public double getMaxWithdrawSum() {
        return maxWithdrawSum;
    }

    @Override
    public void setMaxWithdrawSum() {

    }

    @Override
    public double getSizeOverdraft() {
        return 0;
    }

    public void setMaxWithdrawSum(double maxWithdrawSum) {
        this.maxWithdrawSum = maxWithdrawSum;
    }

    @Override
    public void withdraw(double sum) {
        if (creditLimit >= sum && sum <= maxWithdrawSum) {
            balance -= sum;
            System.out.println("Возьмите ваши деньги. Остаток денежных средств на вашем кредитном счете " +(balance));
        } else {
            System.out.println("Транзакция не возможна. Не достаточно средств или превышена максимальная сумма снятия.");
        }
    }

    @Override
    public void deposit(double sum) {
        balance += sum;
        System.out.println("Вы пополнили счет на "+sum +". Текущий баланс "+(balance));

    }

    @Override
    public void setMaxWithdraw(double sum) {

    }

    @Override
    public String getStatus() {
        return null;
    }
}
