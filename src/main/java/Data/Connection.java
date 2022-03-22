package Data;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    public java.sql.Connection get_connection(){
        java.sql.Connection conection = null;
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/questions", "root", "");
        }catch (SQLException e){
            System.out.println(e);
        }
        return conection;
    }
}
