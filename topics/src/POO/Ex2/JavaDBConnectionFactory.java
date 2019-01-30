package POO.Ex2;

public class JavaDBConnectionFactory implements ConnectionFactory {
    public ConnectionDB createConnection() {
        return new JavaDBConnection();
    }
}
