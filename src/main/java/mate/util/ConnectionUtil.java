package mate.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    // This code for local DB:
    //private static final String URL = "jdbc:mysql://localhost:3306/taxi";
    //private static final String USERNAME = "root or another username";
    //private static final String PASSWORD = "Your password";
    // This code for remoteDB:
    private static final String URL
            = "jdbc:mysql://remotemysql.com:3306/SQifJTkyXf";
    private static final String USERNAME = "SQifJTkyXf";
    private static final String PASSWORD = "x50QR6nsGD";

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Can't find SQL Driver", e);
        }
    }

    public static Connection getConnection() {
        Properties dbProperties = new Properties();
        dbProperties.setProperty("user", USERNAME);
        dbProperties.setProperty("password", PASSWORD);
        try {
            return DriverManager.getConnection(URL, dbProperties);
        } catch (SQLException e) {
            throw new RuntimeException("Can't create connection to DB ", e);
        }
    }
}
