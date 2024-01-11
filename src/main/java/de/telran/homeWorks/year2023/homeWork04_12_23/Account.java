package de.telran.homeWorks.year2023.homeWork04_12_23;



import java.time.LocalDate;
import java.util.Objects;

public class Account {
    private int id;
    private int client_id;
    private String name;
    private int type;
    private int status;
    private double balance;
    private int currency_code;
    LocalDate created_at = LocalDate.parse("2023-12-04");
    LocalDate updated_at = created_at.plusYears(5);


    public Account(){

    }

    public Account(int id, int client_id, String name, int type, int status,
                   double balance, int currency_code) {
        this.id = id;
        this.client_id = client_id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.balance = balance;
        this.currency_code = currency_code;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && client_id == account.client_id &&
                type == account.type && status == account.status &&
                Double.compare(balance, account.balance) == 0 &&
                currency_code == account.currency_code &&
                Objects.equals(name, account.name) &&
                Objects.equals(created_at, account.created_at) &&
                Objects.equals(updated_at, account.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, client_id, name, type, status,
                balance, currency_code);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(int currency_code) {
        this.currency_code = currency_code;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public LocalDate getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDate updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", client_id=" + client_id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", balance=" + balance +
                ", currency_code=" + currency_code +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
