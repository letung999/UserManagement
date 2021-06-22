package sort;

import model.Teacher;

import java.util.ArrayList;

public class SortBySalary {
    public void sortSalaryDesc(ArrayList<Teacher> teachers){
        for(int i = 0; i < teachers.size(); i++){
            for (int j = teachers.size() -1; j > i; j--){
                Teacher bj = teachers.get(j);
                Teacher bbj = teachers.get(j-1);
                if(bbj.getSalary() < bj.getSalary()){
                    teachers.set(j-1, bj);
                    teachers.set(j, bbj);
                }
            }
        }

    }
}
