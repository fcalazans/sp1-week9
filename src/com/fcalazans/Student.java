package com.fcalazans;

public class Student {
    private String name;
    private String programme;
    
    public Student(String name, String programme, int year) {
        this.name = name;
        this.programme = programme;
        this.year = year;
    }
    
    private int year;
    
    // private int totalScore;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getProgramme() {
        return programme;
    }
    
    
    public int getYear() {
        return year;
    }
    
    
    // private int scoreCount;
    // private double average;
    
    
    //Loop:
    // students[0] = new Student();
    // read in name, year of bird, programme
    
    //Enhanced for loop
    // for (Student s : students)
    // s.getProgramme().equals("BSc ISM")
    // s.getName(i)
    
    
    // public void addQuizScore(int score) {
    //     scoreCount++;
    //     totalScore += score;
    // }
    
    
    // public double getAverageScore() {
    //     if (scoreCount > 0) {
    //         average = totalScore / scoreCount;
    //         return average;
    //     }
    //     return average;
    // }
    //
    // public Student(String firstName, String lastName) {
    //     //     this.firstName = firstName;
    //     //     this.lastName = lastName;
    //     //     totalScore = 0;
    //     //     scoreCount = 0;
    //     //
    //     // }
    public Student(String name, int year) {
        this.name = name;
        // totalScore = 0;
        // scoreCount = 0;
        
    }
}
