package POO.Ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDBConnection implements ConnectionDB {
    Connection connection = null;
    String driver;
    String url;
    String user;
    String password;

    private OracleDBConnection() {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:test";
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

    public Connection getConnection() { return connection; }
}
