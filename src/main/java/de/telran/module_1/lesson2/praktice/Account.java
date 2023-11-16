package de.telran.module_1.lesson2.praktice;

public abstract class Account {
    protected String accountNummer;
    protected double balance;
    protected String status;
    protected String openData;
    protected String closeData;
    public abstract void withdraw(double sum);
    public abstract void deposit (double sum);

     public void setStatus(String status) {
        this.status = status;
    }

    public double getBalance() {
        return balance;
    }

    public void closeAccount(String closeDate){
         if (balance == 0){
        this.status ="closed";
        this.closeData = closeDate;
             System.out.println("Ваш аккаунт закрыт");
    } else {
             System.out.println("Невозможно закрыть аккаунт");
         }
}
}
