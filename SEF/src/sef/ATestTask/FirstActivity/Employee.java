package sef.ATestTask.FirstActivity;


public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
        empId = 0;
        jobTitle = "Unknown";
        companyName = "Unknown";
        salary = 0;
    }
    public Employee(int empId, String jobTitle, String companyName, double salary){
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    //TODO 2 add getters and setters


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String introduce(){
        System.out.println("---------------------------------------------------");
        return "My name is " + super.getFirstName() + " " + super.getSecondName() + " and i am " + super.getAge() + " years old and work as " + jobTitle + " in " +companyName + "with a salary of " + salary;
    }

}