package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL ="jdbc:postgresql://localhost:5432/hotel_management";
    private static final String USER = "postgres";
    private static final String PASSWORD ="admin123";

    public static final Connection getConnection() throws SQLException{
        return DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
        );
    }
}