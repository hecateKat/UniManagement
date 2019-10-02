package com.kat.entity;

import lombok.Getter;

@Getter
public class Teacher {

    private int id;
    private String name;
    private double salary;


    /**
     * @param id Teachers id
     * @param name Teachers name
     * @param salary Teachers salary
     */

    public Teacher(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * @param salary sets new salary
     */

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
