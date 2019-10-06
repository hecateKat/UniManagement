package com.kat.entity;

import lombok.Getter;

@Getter
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    /**
     * @param id Teachers id
     * @param name Teachers name
     * @param salary Teachers salary
     */

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * @param salary sets new salary
     */

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     *
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+= salary;
        School.updateTotalMoneySpent(salary);
    }
}
