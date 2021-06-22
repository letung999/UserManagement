package sort;

import model.Student;

import java.util.Comparator;

public class SortByNameStudent implements Comparator<Student> {
    @Override
    public int compare(Student t, Student t1) {
        String name1 = t.getFullName().substring(t.getFullName().lastIndexOf(" "));
        String name2 = t1.getFullName().substring(t1.getFullName().lastIndexOf(" "));
        return name1.compareTo(name2);
    }
}
