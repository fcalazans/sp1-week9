package com.fcalazans;

public class Student {
    private String name;
    private String programme;
    private int year;
    private int totalScore;
    private int scoreCount;
    private double average;
    
    public Student(String name, String programme, int year) {
        this.name = name;
        this.programme = programme;
        this.year = year;
    }
    
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
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getProgramme() {
        return programme;
    }
    
    
    //Loop:
    // students[0] = new Student();
    // read in name, year of bird, programme
    
    //Enhanced for loop
    // for (Student s : students)
    // s.getProgramme().equals("BSc ISM")
    // s.getName(i)
    
    public int getYear() {
        return year;
    }
    
    public void addQuizScore(int score) {
        scoreCount++;
        totalScore += score;
    }
    
    public double getAverageScore() {
        if (scoreCount > 0) {
            average = totalScore / scoreCount;
            return average;
        }
        return average;
    }
    
    public int getTotalScore() {
        return totalScore;
    }
}
