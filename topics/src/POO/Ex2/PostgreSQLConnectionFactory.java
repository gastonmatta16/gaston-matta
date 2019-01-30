package POO.Ex2;

public class PostgreSQLConnectionFactory implements ConnectionFactory {
    public ConnectionDB getConnection() {
        return new PostgreSQLConnection();
    }
}
