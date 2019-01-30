package POO.Ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnection implements ConnectionDB {
    Connection connection = null;
    String driver;
    String url;
    String user;
    String password;

    public PostgreSQLConnection() {
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost/test";
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
