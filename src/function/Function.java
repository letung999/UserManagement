package function;

import model.Student;
import model.Teacher;

import java.util.ArrayList;

public interface Function {
    /*
    * a) Thêm mới giảng viên vào danh sách.
b) Thêm mới sinh viên vào danh sách.
c) Sắp xếp danh sách giảng viên theo tên giảm dần từ z-a.
d) Sắp xếp danh sách giảng viên theo theo mức lương giảm dần.
e) Sắp xếp danh sách giảng viên theo số năm kinh nghiệm giảm dần.
f) Sắp xếp danh sách sinh viên theo tên a-z.
g) Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần.
h) Hiển thị danh sách giảng viên theo dạng bảng gồm các hàng, cột.
i) Hiển thị danh sách sinh viên theo dạng bảng gồm các hàng, cột.
j) Thoát chương trình.*/

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
