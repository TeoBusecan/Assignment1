package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://localhost:3306/aeroport";
    private static final String USER = "root";
    private static final String PASS = "Ciocolata7*" ;

    public MyConnection() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection connection;
        connection = DriverManager.getConnection(DBURL, USER, PASS);
        if (connection != null)
            System.out.println("Successfull");
        return connection;
    }
}