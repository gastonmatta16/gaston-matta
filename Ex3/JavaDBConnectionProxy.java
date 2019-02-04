package Ex3;

import Ex2.Connection;
import Ex2.JavaDBConnection;
import Ex2.JavaDBConnectionFactory;

public class JavaDBConnectionProxy implements Ex2.Connection {

    public JavaDBConnectionProxy(){}

    public java.sql.Connection getConnection() {
        JavaDBConnection instance = JavaDBConnection.getInstance();
        return instance.getConnection();
    }
}
