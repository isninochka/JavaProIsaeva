package de.telran.module_1.lesson2.praktice;

public class DepositAccount extends ClientAccount{

     private double maxDeposit;

    public DepositAccount(double maxDeposit, String accountOwner, String accountNumber, String openDate) {
        this.maxDeposit = maxDeposit;
        this.accountOwner = accountOwner;
        this.accountNummer = accountNumber;
        this.status = "opened";
        this.openData = "today";


    }
    public String getAccountOwner() {
        return accountOwner;
    }

    public double getMaxDeposit() {
        return maxDeposit;
    }




    public void setMaxDeposit(double maxDeposit) {
        this.maxDeposit = maxDeposit;
    }

    @Override
    public void withdraw(double sum) {
        if (sum <= balance) {
            balance -= sum;
            System.out.println("Возьмите ваши деньги.");
        } else {
            System.out.println("Транзакция не возможна. Не достаточно средств.");
        }

    }

    @Override
    public void deposit(double sum) {
        if (sum <= maxDeposit) {
            balance += sum;
            System.out.println("Возьмите ваши деньги.");
        } else {
            System.out.println("Транзакция не возможна. Введите другую сумму.");
        }

    }
}
