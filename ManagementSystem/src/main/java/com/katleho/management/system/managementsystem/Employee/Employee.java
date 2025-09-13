package com.katleho.management.system.managementsystem.Employee;

import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Table("Employee")
public class Employee {
    String name,surname,role;
    @id
    int id;
    public Employee(String name,String surname,String role){
        this.id = UUID.randomUUID().hashCode();
        this.name = name;
        this.surname = surname;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getRole() {
        return role;
    }

    public int getId() {
        return id;
    }

    public boolean compareId(int id){
        return this.id == id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return "Name "+getName()+"\n,Surname "+getSurname()+"\n,Role +"+getRole()+"\n}";
    }
}

