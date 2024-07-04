package Bank_managment_system;
import java.sql.*;
public class Conn {
    Connection c;
     Statement s;
    public Conn(){
        try{
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Monukumar05062004");
            s=c.createStatement();
        }
        catch(Exception e1){
            System.out.println(e1);
        }
    }
}
