package POO.Ex2;

public class OracleDBConnectionFactory implements ConnectionFactory {
    public ConnectionDB createConnection(){
        return new OracleDBConnection();
    }
}
