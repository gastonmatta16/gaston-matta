package Ex4;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private String user;
    private String password;
    private String url;

    public Connection(String user, String password, String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public static class Builder{
        private String type;
        private String user;
        private String password;
        private String dataBaseName;
        private String url;

        public Builder() {}

        public Builder setType(String type) {
            this.type = type;
            return this;
        }
        public Builder setUser(String user) {
            this.user = user;
            return this;
        }
        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }
        public Builder setDataBaseName(String dataBaseName) {
            this.dataBaseName = dataBaseName;
            return this;
        }
        private void setUrl() {
            if (this.type != "" || this.type != null) {
                switch (this.type) {
                    case "JavaDB" : {
                        this.url = "jdbc:derby://localhost/" + this.dataBaseName;
                        break;
                    }
                    case "MySQL" : {
                        this.url = "jdbc:mysql://localhost:3306/" + this.dataBaseName;
                        break;
                    }
                    case "OracleDB" : {
                        this.url = "jdbc:oracle:thin:@localhost:1521:" + this.dataBaseName;
                        break;
                    }
                    case "PostgreSQL" : {
                        this.url = "jdbc:postgresql://localhost/" + this.dataBaseName;
                        break;
                    }
                }
            }
        }

        public java.sql.Connection build() {
            setUrl();
            java.sql.Connection conn = null;
            try {
                conn = DriverManager.getConnection(this.url, this.user, this.password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return conn;
        }
    }


}
