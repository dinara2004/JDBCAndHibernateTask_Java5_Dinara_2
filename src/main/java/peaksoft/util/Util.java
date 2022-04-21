package peaksoft.util;

import org.hibernate.boot.model.relational.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private final Connection connection;

    public Util() throws SQLException {
        connection = DriverManager.getConnection
                ("jdbc:postgresql://localhost:5432/postgres",
                        "postgres",
                        "java");
    }

    public Connection getConnection() {
        return connection;
    }
}
