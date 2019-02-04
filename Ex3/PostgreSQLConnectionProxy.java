package Ex3;

import Ex2.PostgreSQLConnection;

public class PostgreSQLConnectionProxy implements Ex2.Connection {

    public PostgreSQLConnectionProxy() {}

    public java.sql.Connection getConnection() {
        PostgreSQLConnection instance = PostgreSQLConnection.getInstance();
        return instance.getConnection();
    }
}
