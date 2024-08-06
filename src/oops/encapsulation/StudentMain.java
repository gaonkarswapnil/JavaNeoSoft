package oops.encapsulation;


/*
Create a Class Student:
Private attributes: studentID, name, grades (an array or list of integers).
Public methods:
addGrade(int grade)
calculateAverage()
getStudentID()
getName()
getGrades()

Create a Main Class:
Create instances of Student.
Add grades to the students.
Calculate and display the average grade for each student.
*/

import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private int studentID;
    private List<Integer> grades;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    void addGrade(int grade) {
        if(grade>=0 && grade<=100){
            grades.add(grade);
        }else {
            System.out.println("Invalid grade");
        }
    }


    int calculateAverage() {
        int sum = 0;
        for(int i : grades) {
            sum+=i;
        }
        return sum/ grades.size();
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Oliver", 1);
        student.addGrade(13);
        student.addGrade(242);
        student.addGrade(7);
        student.addGrade(1);
        System.out.println(student.calculateAverage());
    }
}
