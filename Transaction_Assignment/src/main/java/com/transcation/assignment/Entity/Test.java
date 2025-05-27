package com.transcation.assignment.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "jpa_test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int  id;
    String name;
    String age;
    String address;

    public Test(String name, String age,String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Test() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
