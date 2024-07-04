package Bank_managment_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn1 {

    Connection cn;
    Statement s;
    conn1(){
        try{
            //1 register the driver
            // Class.forName(com.mysql.cj.jdbc.Driver);
            // 2 create connection
            cn= DriverManager.getConnection("jdbc:mysql:///bms","root","Monukumar05062004");
            // prepared statement
            s=cn.createStatement();
        }catch(Exception e ){
            System.out.println(e);
        }

    }

}
