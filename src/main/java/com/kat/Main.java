package com.kat;

import com.kat.entity.School;
import com.kat.entity.Student;
import com.kat.entity.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Teacher kondrat = new Teacher(1, "Kondrat", 1600);
        Teacher krzysztof = new Teacher(2, "Krzysztof", 2000);
        Teacher karolina = new Teacher(3, "Karolina", 2500);

        List<Teacher> teachersList = new ArrayList<Teacher>();
        teachersList.add(kondrat);
        teachersList.add(krzysztof);
        teachersList.add(karolina);


        Student michal = new Student(1, "Michal", 2);
        Student cezary = new Student(2, "Cezary", 1);
        Student aleksander = new Student(3, "Aleksander", 5);

        List<Student> studentsList = new ArrayList<Student>();
        studentsList.add(michal);
        studentsList.add(cezary);
        studentsList.add(aleksander);


        School hightSchool = new School(teachersList, studentsList);
        System.out.println(hightSchool.getTotalEarnedMoney());
    }
}
