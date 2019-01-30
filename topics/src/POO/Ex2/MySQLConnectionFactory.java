package POO.Ex2;

public class MySQLConnectionFactory implements ConnectionFactory {
    public ConnectionDB createConnection() {
        return new MySQLConnection();
    }
}
