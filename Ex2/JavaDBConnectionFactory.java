package Ex2;

public class JavaDBConnectionFactory implements ConnectionAbstractFactory {

    public java.sql.Connection createConnection() {

        JavaDBConnection conn = JavaDBConnection.getInstance();
        return conn.getConnection();
    }
}
