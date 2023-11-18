package de.telran.module_1.lessons.lesson2.bankApp.classes;

import de.telran.module_1.lessons.lesson2.bankApp.interfaces.admins.AdminDeposit;
import de.telran.module_1.lessons.lesson2.bankApp.interfaces.Owner;

public class DepositAccount extends ClientAccount implements Owner, AdminDeposit {

     private double maxDeposit;

    public DepositAccount(String accountOwner, String accountNumber, double balance, double maxDeposit) {
        super(accountOwner, accountNumber, balance);
        this.maxDeposit = maxDeposit;
    }

    public double getMaxDeposit() {
        return maxDeposit;
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

    public void setMaxDeposit(double maxDeposit) {
        this.maxDeposit = maxDeposit;
    }

    @Override
    public void withdraw(double sum) {
        if (balance >= sum) {
            balance -= sum;
            System.out.println("Возьмите ваши деньги. Остаток денежных средств на вашем депозитном счете " +(balance));
        } else {
            System.out.println("Транзакция не возможна. Не достаточно средств.");
        }

    }

    @Override
    public void deposit(double sum) {
        if (sum <= maxDeposit) {
            balance += sum;
            System.out.println("Вы пополнили счет на "+sum +". Текущий баланс "+(balance));
        } else {
            System.out.println("Транзакция не возможна. Максимальная сумма внесения " + maxDeposit);
        }

    }


    @Override
    public String getStatus() {
        return null;
    }
}
