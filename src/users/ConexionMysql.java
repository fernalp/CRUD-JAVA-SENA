
package users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMysql {
    Connection cn;
    
    public Connection conectar()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/tb_users", "sena", "sena");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("ERROR" + e);
        }
        
        return cn;
    }
}
