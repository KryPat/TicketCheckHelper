package pl.tch;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class Database {
    public static void forName(String Database)throws ClassNotFoundException; {
        Class.forName("oracle.jdbc.driver.OracleDriver");
    }
    public static Connection getConnection(String url)throws SQLException {
        Connection con=DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost"
        )
    }
}
