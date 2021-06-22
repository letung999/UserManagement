package sort;

import model.Student;

import java.util.Comparator;

public class SortGBADesc implements Comparator<Student> {

    @Override
    public int compare(Student student, Student student1) {
        float result = student.getGba() - student1.getGba();
        if(result > 0){
            return -1;
        }
        else{
            if(result < 0){
                return 1;
            }
        }
        return 0;
    }
}
