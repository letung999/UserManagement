package connectDatabase;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import model.Student;

import java.sql.SQLException;
import java.util.ArrayList;

public class InsertData {
    public int insert(ArrayList<Student> list) {
        var config = new Config();
        var ds = config.config();
        try {
            var conn = ds.getConnection();
            var sql = "INSERT INTO dbo.STUDENT VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            var ps = conn.prepareStatement(sql);
            for (var student:list) {
                ps.setString(1, student.getPersonId());
                ps.setString(2, student.getFullName());
                ps.setString(3, student.getAddress());
                ps.setString(4, student.getDateOfBirth());
                ps.setString(5, student.getEmail());
                ps.setString(6, student.getPhoneNumber());
                ps.setString(7, student.getIdStudent());
                ps.setString(8, student.getNameUniversity());
                ps.setString(9, student.getNameClass());
                ps.setString(10, student.getNameDepartment());
                ps.setFloat(11, student.getGba());
                ps.executeUpdate();
            }
        } catch (SQLServerException e) {
            e.printStackTrace();
            return -1;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

}
