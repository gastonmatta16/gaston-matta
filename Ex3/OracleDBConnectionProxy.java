package Ex3;

import Ex2.OracleDBConnection;

public class OracleDBConnectionProxy implements Ex2.Connection {

    public OracleDBConnectionProxy() {}

    public java.sql.Connection getConnection() {
        OracleDBConnection instance = OracleDBConnection.getInstance();
        return instance.getConnection();
    }
}
