package de.telran.module_1.lessons.lesson2.bankApp.classes;


public abstract class ClientAccount extends Account {

    protected String accountOwner;


    public ClientAccount(String accountOwner, String accountNumber, double balance) {
        super(accountNumber, balance);
        this.accountOwner = accountOwner;
    }

    public String getAccountOwner() {
        return accountOwner;
    }



}
