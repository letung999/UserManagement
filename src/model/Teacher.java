package model;

import java.io.Serializable;

public class Teacher extends Person implements Serializable {

    private String idEmployee;
    private String role;
    private double salary;
    private int yearExperiences;

    public Teacher() {

    }

    public Teacher(String personId, String fullName, String address,
                   String dateOfBirth, String email, String phoneNumber,
                   String idEmployee, String role, double salary, int yearExperiences) {
        super(personId, fullName, address, dateOfBirth, email, phoneNumber);
        this.idEmployee = idEmployee;
        this.role = role;
        this.salary = salary;
        this.yearExperiences = yearExperiences;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearExperiences() {
        return yearExperiences;
    }

    public void setYearExperiences(int yearExperiences) {
        this.yearExperiences = yearExperiences;
    }
}
