package de.telran.homeWorks.homeWork04_12_23;

import java.util.Date;
import java.util.Objects;

public class Agreement {
    private int id;
    private byte account_id;
    private int product_id;
    private double interest_rate;
    private int status;
    private double sum;
    Date created_at = new Date();
    Date updated_at = new Date();

    public Agreement() {
    }

    public Agreement(int id, byte account_id, int product_id, double interest_rate,
                     int status, double sum, Date created_at, Date updated_at) {
        this.id = id;
        this.account_id = account_id;
        this.product_id = product_id;
        this.interest_rate = interest_rate;
        this.status = status;
        this.sum = sum;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getAccount_id() {
        return account_id;
    }

    public void setAccount_id(byte account_id) {
        this.account_id = account_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agreement agreement = (Agreement) o;
        return id == agreement.id && account_id == agreement.account_id &&
                product_id == agreement.product_id &&
                Double.compare(interest_rate, agreement.interest_rate) == 0
                && status == agreement.status && Double.compare(sum, agreement.sum) == 0
                && Objects.equals(created_at, agreement.created_at) &&
                Objects.equals(updated_at, agreement.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account_id, product_id, interest_rate,
                status, sum, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "Agreement{" +
                "id=" + id +
                ", account_id=" + account_id +
                ", product_id=" + product_id +
                ", interest_rate=" + interest_rate +
                ", status=" + status +
                ", sum=" + sum +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
