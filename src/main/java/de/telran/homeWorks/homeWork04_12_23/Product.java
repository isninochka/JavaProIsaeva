package de.telran.homeWorks.homeWork04_12_23;

import java.util.Date;
import java.util.Objects;

public class Product {
    private int id;
    private int manager_id;
    private String name;
    private int status;
    private int currently_code;
    private double interest_rate;
    private int limit;
    Date created_at = new Date();
    Date updated_at = new Date();

    public Product() {
    }

    public Product(int id, int manager_id, String name, int status,
                   int currently_code, double interest_rate, int limit,
                   Date created_at, Date updated_at) {
        this.id = id;
        this.manager_id = manager_id;
        this.name = name;
        this.status = status;
        this.currently_code = currently_code;
        this.interest_rate = interest_rate;
        this.limit = limit;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCurrently_code() {
        return currently_code;
    }

    public void setCurrently_code(int currently_code) {
        this.currently_code = currently_code;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
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
        Product product = (Product) o;
        return id == product.id && manager_id == product.manager_id &&
                status == product.status && currently_code == product.currently_code
                && Double.compare(interest_rate, product.interest_rate) == 0 &&
                limit == product.limit && Objects.equals(name, product.name) &&
                Objects.equals(created_at, product.created_at) &&
                Objects.equals(updated_at, product.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manager_id, name, status, currently_code,
                interest_rate, limit, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", manager_id=" + manager_id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", currently_code=" + currently_code +
                ", interest_rate=" + interest_rate +
                ", limit=" + limit +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
