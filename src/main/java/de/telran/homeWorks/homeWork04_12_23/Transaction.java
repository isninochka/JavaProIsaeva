package de.telran.homeWorks.homeWork04_12_23;

import java.util.Date;
import java.util.Objects;

public class Transaction {
    private byte id;
    private byte debit_account_id;
    private byte credit_account_id;
    private int type;
    private double amount;
    private String description;
    Date created_at = new Date();

    public Transaction() {
    }

    public Transaction(byte id, byte debit_account_id,
                       byte credit_account_id, int type,
                       double amount, String description, Date created_at) {
        this.id = id;
        this.debit_account_id = debit_account_id;
        this.credit_account_id = credit_account_id;
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.created_at = created_at;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public byte getDebit_account_id() {
        return debit_account_id;
    }

    public void setDebit_account_id(byte debit_account_id) {
        this.debit_account_id = debit_account_id;
    }

    public byte getCredit_account_id() {
        return credit_account_id;
    }

    public void setCredit_account_id(byte credit_account_id) {
        this.credit_account_id = credit_account_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return id == that.id && debit_account_id == that.debit_account_id
                && credit_account_id == that.credit_account_id &&
                type == that.type && Double.compare(amount, that.amount) == 0
                && Objects.equals(description, that.description) &&
                Objects.equals(created_at, that.created_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, debit_account_id, credit_account_id,
                type, amount, description, created_at);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", debit_account_id=" + debit_account_id +
                ", credit_account_id=" + credit_account_id +
                ", type=" + type +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}
