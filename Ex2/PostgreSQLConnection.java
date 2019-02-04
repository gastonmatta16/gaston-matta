package Ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnection implements Ex2.Connection {

    private static PostgreSQLConnection instance = null;
    private Connection connection = null;

    private PostgreSQLConnection() {

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/test", "user", "password");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static PostgreSQLConnection getInstance() {
        if (instance == null) {
            synchronized (PostgreSQLConnection.class) {
                if (instance == null) {
                    instance = new PostgreSQLConnection();
                }
            }
        }
        return instance;
    }

    public java.sql.Connection getConnection() { return connection; }
}
