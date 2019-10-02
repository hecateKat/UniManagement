package com.kat.entity;

import lombok.Getter;

@Getter
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**@param id id for the student :unique
       @param name name of the student
       @param grade students grade
       */

    public Student(int id, String name, int grade, int feesPaid, int feesTotal) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    /** @param grade new students grade
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**Keep adding fees to feesPaid
     * @param fees fees that the students pays
     */

    public void updateFeesPaid (int fees) {
        feesPaid += fees;
    }


}
