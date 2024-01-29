package de.telran.modul_6Potoki;

import lombok.SneakyThrows;

public class SimpleBank {
    public static void main(String[] args) {
        Account account = new Account();
        new Husband(account).start();
        new Wife(account).start();



        }

    }

class Account{
    private double sumAccount;

    public double getSumAccount() {

        return sumAccount;
    }

    public void setSumAccount(double sumAccount) {

        this.sumAccount = sumAccount;
    }


    public double getSumAccountAdd(double addSum) {

        sumAccount+= addSum;
        return addSum;
    }
    public double setSumAccountSub(double addSum) {

        sumAccount-= addSum;
        return addSum;
    }

}

class Husband extends Thread{
    Account account;

    public Husband(Account account) {
        this.account = account;
    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            double currentSum = account.getSumAccount();
            System.out.println(Thread.currentThread().getName()+" остаток по счету = "+ currentSum);
            account.setSumAccount(currentSum+100);
            System.out.println(Thread.currentThread().getName()+" остаток по счету = "+ account.getSumAccount());
            sleep(100);
        }

    }
}
class Wife extends Thread{
    Account account;

    public Wife(Account account) {
        this.account = account;
    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            double currentSum = account.getSumAccount();
            System.out.println(Thread.currentThread().getName()+" остаток по счету = "+ currentSum);
            account.setSumAccount(currentSum-100);
            System.out.println(Thread.currentThread().getName()+" остаток по счету = "+ account.getSumAccount());
            sleep(1000);
        }

    }
}

