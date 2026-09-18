package config;

import java.io.InputStream;
import java.util.Properties;

public class DatabaseConfig {
    private static final Properties properties = new Properties();

    static {
        try (InputStream input = DatabaseConfig.class.getClassLoader().getResourceAsStream("db.properties")) {
            if (input != null) {
                properties.load(input);
            } else {
                System.err.println("Le fichier db.properties est introuvable !");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erreur lors du chargement de la configuration de la base de données", e);
        }
    }

    public static String getDbUrl() {
        return properties.getProperty("db.url", "jdbc:postgresql://localhost:5432/hotel_management");
    }

    public static String getDbUser() {
        return properties.getProperty("db.user", "postgres");
    }

    public static String getDbPassword() {
        return properties.getProperty("db.password", "admin123");
    }
}
