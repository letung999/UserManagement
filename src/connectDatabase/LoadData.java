package connectDatabase;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import model.Student;

import java.sql.SQLException;
import java.util.ArrayList;

public class LoadData {
    public ArrayList<Student> loadData() {
        ArrayList<Student> students = new ArrayList<>();
        var config = new Config();
        var ds = config.config();
        try {
            var conn = ds.getConnection();
            var sql = "SELECT * FROM dbo.STUDENT";
            var ps = conn.prepareStatement(sql);
            var results = ps.executeQuery();
            while (results.next()) {
                String personId = results.getString(1);
                String fullName = results.getString(2);
                String address = results.getString(3);
                String dateOfBirth = results.getString(4);
                String email = results.getString(5);
                String phoneNumber = results.getString(6);
                String idStudent = results.getString(7);
                String nameUniversity = results.getString(8);
                String nameClass = results.getString(9);
                String nameDepartment = results.getString(10);
                float gba = results.getFloat(11);
                var student = new Student(personId, fullName, address, dateOfBirth, email, phoneNumber, idStudent,
                        nameUniversity, nameClass, nameDepartment, gba);
                students.add(student);
            }

        } catch (SQLServerException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

}
