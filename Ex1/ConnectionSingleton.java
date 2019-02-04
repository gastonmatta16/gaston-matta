package Ex1;

import java.sql.*;

//1st Ex
public class ConnectionSingleton {

    private static ConnectionSingleton instance = null;
    private Connection connection;

    private ConnectionSingleton() {
        connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "password");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ConnectionSingleton getInstance() {
            if (instance == null) {
                synchronized (ConnectionSingleton.class) {
                    if (instance == null) {
                        instance = new ConnectionSingleton();
                    }
                }
            }
            return instance;
    }

    public Connection getConnection() {
        return connection;  
    }
}
