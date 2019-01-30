package POO.Ex2;

public class OracleDBConnectionFactory implements ConnectionFactory {
    public ConnectionDB getConnection(){
        return new OracleDBConnection();
    }
}
