package Ex3;

import Ex2.MySQLConnection;

public class MySQLConnectionProxy implements Ex2.Connection {

    public MySQLConnectionProxy(){}

    public java.sql.Connection getConnection() {
        MySQLConnection instance = MySQLConnection.getInstance();
        return instance.getConnection();
    }
}
