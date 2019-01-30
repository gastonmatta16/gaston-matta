package POO.Ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaDBConnection implements ConnectionDB {
    Connection connection = null;
    String driver;
    String url;
    String user;
    String password;

    private JavaDBConnection() {
        String driver = "org.apache.derby.jdbc.EmbeddedDriver";
        String url = "jdbc:derby://localhost/test";
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
