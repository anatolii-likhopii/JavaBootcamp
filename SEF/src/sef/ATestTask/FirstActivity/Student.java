package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student extends Person {

    private int grade;
    private String school;

    public Student(int grade, String school) {
        this.grade = grade;
        this.school= school;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }


    public void introduce(){
        System.out.println("I am study in university " + school);}



}
