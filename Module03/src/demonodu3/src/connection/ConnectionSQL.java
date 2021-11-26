package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQL { private static final String USER_NAME= "root";
    private static final String PASSWORD ="quynhnhu2809";
    private static final String HOST="localhost";
    private static final String DATABASE ="benhnhan";
    private static final String PORT="3306";
    private static Connection connection;
    public static Connection getConnection()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://"+HOST+":"+PORT+"/" +DATABASE,USER_NAME,PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public  static void close()
    {
        try{
            if(connection != null)
            {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
