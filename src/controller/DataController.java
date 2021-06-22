package controller;

import function.Function;
import model.Student;
import model.Teacher;

import java.io.*;
import java.util.ArrayList;

public class DataController implements Function {

    @Override
    public void addElementInList(ArrayList list, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList readElementInList(String fileName) {
        var list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void showInfoTeacher(ArrayList<Teacher> teachers) {
        /*
        * String personId, fullName, address, dateOfBirth, email, phoneNumber, idEmployee, role;
                    double salary;
                    int yearExperiences;*/
        System.out.printf("%-15s%-25s%-15s%-15s%-20s%-15s%-15s%-20s%-15s%-15s\n",
                "personId", "fullName", "address", "dateOfBirth"
                , "email", "phoneNumber", "idEmployee", "role", "salary", "yearExperiences");


        for (var teacher : teachers) {
            System.out.printf("%-15s%-25s%-15s%-15s%-20s%-15s%-15s%-20s%-15s%-15s\n",
                    teacher.getPersonId(), teacher.getFullName(), teacher.getAddress(),
                    teacher.getDateOfBirth(), teacher.getEmail(), teacher.getPhoneNumber(),
                    teacher.getIdEmployee(), teacher.getRole(), teacher.getSalary(), teacher.getYearExperiences());
        }
    }

    @Override
    public void showInfoStudent(ArrayList<Student> students) {
        System.out.printf("%-15s%-20s%-10s%-15s%-20s%-15s%-15s%-20s%-15s%-20s%-15s\n",
                "personId", "fullName", "address", "dateOfBirth", "email", "phoneNumber",
                "idStudent", "nameUniversity", "nameClass", "nameDepartment", "gba");

        for (var student : students) {
            System.out.printf("%-15s%-20s%-10s%-15s%-20s%-15s%-15s%-20s%-15s%-20s%-15s\n",
                    student.getPersonId(), student.getFullName(), student.getAddress(), student.getDateOfBirth(),
                    student.getEmail(), student.getPhoneNumber(), student.getIdStudent(),
                    student.getNameUniversity(), student.getNameClass(), student.getNameDepartment(), student.getGba());
        }
    }

    @Override
    public boolean checkExit(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getPersonId().equals(id) == true) {
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Student> searchStudentByName(ArrayList<Student> list, String name) {
        var results = new ArrayList<Student>();
        String regex = ".*" + name.toLowerCase() + ".*";
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getFullName().toLowerCase().equals(name) == true) {
                results.add(list.get(i));
            }

        }
        return results;
    }


}
