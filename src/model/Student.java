package model;

import java.io.Serializable;

public class Student extends Person implements Serializable {
    
    private String idStudent;
    private String nameUniversity;
    private String nameClass;
    private String nameDepartment;
    private float gba;

    public Student() {

    }

    public Student(String personId, String fullName, String address, String dateOfBirth, String email,
                   String phoneNumber, String idStudent, String nameUniversity,
                   String nameClass, String nameDepartment, float gba) {
        super(personId, fullName, address, dateOfBirth, email, phoneNumber);
        this.idStudent = idStudent;
        this.nameUniversity = nameUniversity;
        this.nameClass = nameClass;
        this.nameDepartment = nameDepartment;
        this.gba = gba;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public float getGba() {
        return gba;
    }

    public void setGba(float gba) {
        this.gba = gba;
    }
}
