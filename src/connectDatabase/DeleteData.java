package connectDatabase;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.SQLException;

public class DeleteData {
    public int deleteElement(String PersonID){
        var config = new Config();
        var ds = config.config();
        try {
            var conn = ds.getConnection();
            var sql = "DELETE FROM dbo.STUDENT WHERE personId='" + PersonID+"'";
            var ps = conn.prepareStatement(sql);
            return ps.executeUpdate();
        } catch (SQLServerException e) {
            e.printStackTrace();
            return -1;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
