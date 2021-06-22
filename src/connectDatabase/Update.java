package connectDatabase;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.SQLException;

public class Update {
    public int updateData(String personID, float score) {
        var config = new Config();
        var ds = config.config();
        try {
            var conn = ds.getConnection();
            var sql = "UPDATE dbo.STUDENT SET gba =" + score + "WHERE personId ='" + personID + "'";
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
