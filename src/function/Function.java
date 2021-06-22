package function;

import model.Student;
import model.Teacher;

import java.util.ArrayList;

public interface Function {
    /**
     * @param list
     * @param fileName
     */
    void addElementInList(ArrayList list, String fileName);

    /**
     * @param fileName
     * @return
     */
    ArrayList readElementInList(String fileName);

    void showInfoTeacher(ArrayList<Teacher> teachers);

    /**
     * @param students
     */
    void showInfoStudent(ArrayList<Student> students);

    boolean checkExit(ArrayList<Student> list, String id);

    ArrayList<Student> searchStudentByName(ArrayList<Student> list, String name);


}
