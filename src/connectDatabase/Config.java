package connectDatabase;


import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class Config {
    private static final String NAME_SERVER ="DESKTOP-7QK2KIP\\SQLEXPRESS";
    private static final String NAME_USER ="sa";
    private static final String NAME_DB ="PERSON";
    private static final String NAME_PASSWORD ="123";
    private static final int NAME_PORT =1433;

    public SQLServerDataSource config(){
        var ds = new SQLServerDataSource();
        ds.setServerName(NAME_SERVER);
        ds.setUser(NAME_USER);
        ds.setDatabaseName(NAME_DB);
        ds.setPortNumber(NAME_PORT);
        ds.setPassword(NAME_PASSWORD);
        return ds;
    }
}
