import webshop.MenuAction;
import webshop.query.HowManyProducts;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        // database connection
        Properties properties = new Properties();
        properties.load(Main.class.getResourceAsStream("application.properties"));
        String user = properties.getProperty("db_user");
        String password = properties.getProperty("db_pass");
        String url = properties.getProperty("db_url");

        HowManyProducts howManyProducts = new HowManyProducts();

        MenuAction[] menuActions = {

        };
        try (Connection connection
                     = DriverManager.getConnection(url, user, password);
             Menu menu = new Menu(connection, menuActions)) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
