package Ex2;

public class MySQLConnectionFactory implements ConnectionAbstractFactory {

    public java.sql.Connection createConnection() {

        MySQLConnection conn = MySQLConnection.getInstance();
        return conn.getConnection();
    }
}
