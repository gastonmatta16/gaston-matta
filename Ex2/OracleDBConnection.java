package Ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDBConnection implements Ex2.Connection {

    private static OracleDBConnection instance = null;
    private java.sql.Connection connection = null;

    private OracleDBConnection() {

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:test", "user", "password");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static OracleDBConnection getInstance() {
        if (instance == null) {
            synchronized (OracleDBConnection.class) {
                if (instance == null) {
                    instance = new OracleDBConnection();
                }
            }
        }
        return instance;
    }

    public java.sql.Connection getConnection() { return connection; }
}
