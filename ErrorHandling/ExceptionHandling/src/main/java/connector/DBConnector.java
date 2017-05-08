package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector
{
    private final static String driver = "com.mysql.cj.jdbc.Driver";
    private final static String url = "jdbc:mysql://localhost/userdb";
    private final static String user = "root";
    private final static String password = "root";

    public static Connection getConnection()
    {
        Connection conn = null;
        
        try
        {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        return conn;
    }
}
