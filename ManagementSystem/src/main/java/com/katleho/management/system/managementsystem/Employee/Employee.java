package com.katleho.management.system.managementsystem.Employee;

import java.util.UUID;

public class Employee {
    String name,surname,role;
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

    public String toString(){
        return "Name "+getName()+"\n,Surname "+getSurname()+"\n,Role +"+getRole()+"\n}";
    }
}

