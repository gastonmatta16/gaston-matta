package POO.Ex2;

public class JavaDBConnectionFactory implements ConnectionFactory {
    public ConnectionDB getConnection() {
        return new JavaDBConnection();
    }
}
