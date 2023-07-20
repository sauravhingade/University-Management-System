
package university.management.and.system;



import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;   // it icludes the executeQuery() method  that helps to execute sql queries

    Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // register the driver class of mysql
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "saurav8669");  // creating connection string to mention the info of our database and establishing connection with ity using interface Connection 
            s = c.createStatement();          // it icludes the executeQuery() method  that helps to execute sql queries
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
