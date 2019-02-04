package Ex2;

public class OracleDBConnectionFactory implements ConnectionAbstractFactory {

    public java.sql.Connection createConnection(){

        OracleDBConnection conn = OracleDBConnection.getInstance();
        return conn.getConnection();
    }
}
