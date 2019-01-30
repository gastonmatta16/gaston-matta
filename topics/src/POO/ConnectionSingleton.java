package POO;

import java.sql.*;

public class ConnectionSingleton {

    private static Connection connection = null;
    private String driver;
    private String url;
    private String user;
    private String password;

    private ConnectionSingleton() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "user";
        String password = "password";

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() {
        if (connection == null) {
            new ConnectionSingleton();
        }

        return connection;  
    }
}
