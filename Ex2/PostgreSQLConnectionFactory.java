package Ex2;

public class PostgreSQLConnectionFactory implements Ex2.ConnectionAbstractFactory {

    public java.sql.Connection createConnection() {

        Ex2.PostgreSQLConnection conn = Ex2.PostgreSQLConnection.getInstance();
        return conn.getConnection();
    }
}
