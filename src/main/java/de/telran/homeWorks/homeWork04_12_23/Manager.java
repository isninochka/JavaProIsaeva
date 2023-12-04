package de.telran.homeWorks.homeWork04_12_23;

import java.util.Date;
import java.util.Objects;

public class Manager {
    private int id;
    private String first_name;
    private String last_name;
    private int status;
    Date created_at = new Date();
    Date updated_at = new Date();

    public Manager() {
    }

    public Manager(int id, String first_name, String last_name,
                   int status, Date created_at, Date updated_at) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
        Manager manager = (Manager) o;
        return id == manager.id && status == manager.status &&
                Objects.equals(first_name, manager.first_name) &&
                Objects.equals(last_name, manager.last_name) &&
                Objects.equals(created_at, manager.created_at) &&
                Objects.equals(updated_at, manager.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, status, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", status=" + status +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
