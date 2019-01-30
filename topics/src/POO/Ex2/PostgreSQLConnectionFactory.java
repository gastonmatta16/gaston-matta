package POO.Ex2;

public class PostgreSQLConnectionFactory implements ConnectionFactory {

    public ConnectionDB createConnection() {
        return new PostgreSQLConnection();
    }
}
