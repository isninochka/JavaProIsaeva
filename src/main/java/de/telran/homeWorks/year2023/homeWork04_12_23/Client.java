package de.telran.homeWorks.year2023.homeWork04_12_23;

import java.util.Date;
import java.util.Objects;

public class Client {
    private byte id;
    private int manager_id;
    private int status;
    private String tax_code;
    private String first_name;
    private String last_name;
    private String email;
    private String address;
    private String phone;
    Date created_at = new Date();
    Date updated_at = new Date();

    public Client() {
    }

    public Client(byte id, int manager_id, int status, String tax_code,
                  String first_name, String last_name, String email,
                  String address, String phone, Date created_at, Date updated_at) {
        this.id = id;
        this.manager_id = manager_id;
        this.status = status;
        this.tax_code = tax_code;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTax_code() {
        return tax_code;
    }

    public void setTax_code(String tax_code) {
        this.tax_code = tax_code;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        Client client = (Client) o;
        return id == client.id && manager_id == client.manager_id
                && status == client.status && Objects.equals(tax_code, client.tax_code)
                && Objects.equals(first_name, client.first_name) &&
                Objects.equals(last_name, client.last_name) &&
                Objects.equals(email, client.email) && Objects.equals(address, client.address)
                && Objects.equals(phone, client.phone) && Objects.equals(created_at, client.created_at)
                && Objects.equals(updated_at, client.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manager_id, status, tax_code, first_name, last_name, email,
                address, phone, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", manager_id=" + manager_id +
                ", status=" + status +
                ", tax_code='" + tax_code + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
