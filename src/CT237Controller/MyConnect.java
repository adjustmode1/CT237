
package CT237Controller;

import com.mysql.jdbc.MySQLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DELL
 */
public class MyConnect {

    public static Connection connect() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Connection conn = null;       
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/cuahang?"+"user=root");
            System.out.println("ket noi thanh cong");
        } catch (SQLException ex) {
            System.out.println("no");
           ex.printStackTrace();
        }
        return conn;
    }
}
