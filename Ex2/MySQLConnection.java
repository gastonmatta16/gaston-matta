package Ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection implements Ex2.Connection {

    private static MySQLConnection instance = null;
    private java.sql.Connection connection = null;

    private MySQLConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "password");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static MySQLConnection getInstance() {
        if (instance == null) {
            synchronized (MySQLConnection.class) {
                if (instance == null) {
                    instance = new MySQLConnection();
                }
            }
        }
        return instance;
    }

    public java.sql.Connection getConnection() { return connection; }
}
