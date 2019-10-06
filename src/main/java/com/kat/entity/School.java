package com.kat.entity;

import lombok.Getter;

import java.util.List;

@Getter
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalEarnedMoney;
    private static int allSpendMoney;

    /**
     * @param teachers list of teachers
     * @param students list of students
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalEarnedMoney = 0;
        allSpendMoney = 0;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalEarnedMoney;
    }

    /**
     * Adds the total money earned by the school.
     *
     * @param MoneyEarned money that is supposed to be  added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalEarnedMoney += MoneyEarned;
    }

    /**
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return allSpendMoney;
    }

    /**
     * update the money that is spent by the school which
     * is the salary given by the school to its teachers.
     *
     * @param moneySpent the money spent by school.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        allSpendMoney -= moneySpent;
    }
}
