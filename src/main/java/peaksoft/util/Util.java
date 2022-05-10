package peaksoft.util;

import jakarta.persistence.EntityManagerFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import peaksoft.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    // реализуйте настройку соеденения с БД
    private final Connection connection;

    public static EntityManagerFactory createEntityManagerFactory() {
        Properties properties = new Properties();
        properties.setProperty(Environment.DRIVER, "org.postgresql.Driver");
        properties.setProperty(Environment.URL, "jdbc:postgresql://localhost:5432/hibernate_p");
        properties.setProperty(Environment.USER, "postgres");
        properties.setProperty(Environment.PASS, "java");

        properties.setProperty(Environment.HBM2DDL_AUTO, "update");
        properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        properties.setProperty(Environment.SHOW_SQL, "true");

        Configuration configuration = new Configuration();

        configuration.setProperties(properties);

        configuration.addAnnotatedClass(User.class);

        return configuration.buildSessionFactory().unwrap(EntityManagerFactory.class);
    }

    public Util() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/hibernate_p",
                "postgres","java");
    }

    public Connection getConnection(){
        return connection;
    }
}
