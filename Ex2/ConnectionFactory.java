package Ex2;

public final class ConnectionFactory {

    private ConnectionFactory() { }

    public static java.sql.Connection getConnection(String type) {
        switch(type) {
            case "JavaDB": {
                JavaDBConnectionFactory factory = new JavaDBConnectionFactory();
                return factory.createConnection();
            }
            case "MySQL": {
                MySQLConnectionFactory factory = new MySQLConnectionFactory();
                return factory.createConnection();
            }
            case "OracleDB": {
                OracleDBConnectionFactory factory = new OracleDBConnectionFactory();
                return factory.createConnection();
            }
            case "PostgreSQL": {
                PostgreSQLConnectionFactory factory = new PostgreSQLConnectionFactory();
                return factory.createConnection();
            }

            default: {
                return null;
            }
        }
    }
}
