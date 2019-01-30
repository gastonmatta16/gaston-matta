package POO.Ex2;

public class MySQLConnectionFactory implements ConnectionFactory {
    public ConnectionDB getConnection() {
        return new MySQLConnection();
    }
}
