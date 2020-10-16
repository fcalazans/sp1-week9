package com.fcalazans;

import java.util.Scanner;

public class StudentTest {
    Scanner input = new Scanner(System.in);
    
    /* to do: Write code to:
    1. Declare and create an array of 10 Students.
    2. Fill up the array by creating 10 instances
    of students where the name, year of birth and
    programme of study are entered at the
    keyboard.
    */
    public static void main(String[] args) {
        
        //Create array of students (type Student)
        Student[] students = new Student[10];
        Student student1 = new Student("Fabio", 1979);
        System.out.println(student1.getName());
        student1.addQuizScore(2);
        student1.addQuizScore(4);
        student1.addQuizScore(3);
        student1.addQuizScore(3);
        student1.addQuizScore(3);
        student1.addQuizScore(3);
        System.out.println("Total score is: " + student1.getTotalScore());
        System.out.println("Average is: " + student1.getAverageScore());
    }
}
