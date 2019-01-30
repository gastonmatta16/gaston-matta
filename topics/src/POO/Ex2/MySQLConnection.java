package POO.Ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection implements ConnectionDB {
    Connection connection = null;
    String driver;
    String url;
    String user;
    String password;

    public MySQLConnection() {
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

    public Connection getConnection() { return connection; }
}
