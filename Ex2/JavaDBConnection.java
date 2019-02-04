package Ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaDBConnection implements Ex2.Connection {

    private static JavaDBConnection instance = null;
    private java.sql.Connection connection;


    private JavaDBConnection() {
        connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost/test", "user", "password");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static JavaDBConnection getInstance() {
        if (instance == null) {
            synchronized (JavaDBConnection.class) {
                if (instance == null) {
                    instance = new JavaDBConnection();
                }
            }
        }
        return instance;
    }

    public java.sql.Connection getConnection() { return connection; }
}
