
package book_bank_mangt;

import java.sql.*;

public class DBconn {
    Connection con = null;
    
    public static Connection ConDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\tamil\\OneDrive\\Documents\\NetBeansProjects\\book_bank_mangt\\myDB1.db");
            System.out.println("DataBase connection done...!");
            return con;
        }
        catch(Exception e)
        {
            System.out.println("DB Connection Failed.." + e);
            return null;
        }
        
    }
    
    
}
