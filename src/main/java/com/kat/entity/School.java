package com.kat.entity;

import lombok.Getter;

import java.util.List;

@Getter
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalEarnedMoney;
    private int allSpendMoney;

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

    public void addTeacher (Teacher teacher){
        teachers.add(teacher);
    }

    public void addStudent (Student student){
        students.add(student);
    }

    /**
     * @param earnedMoney earned money that is add to total money that school got
     */

    public void updateTotalEarnedMoney(int earnedMoney) {
        totalEarnedMoney += earnedMoney;
    }


    /**
     * @param spendMoney spend money that is add to total money that school spend
     */

    public void updateAllSpendMoney(int spendMoney) {
        totalEarnedMoney -= spendMoney;
    }
}
