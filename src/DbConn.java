
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DbConn {
    public static Connection conn() {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            
            return con;
        } catch (ClassNotFoundException | SQLException ex) {            
            //Logger.getLogger(DbConn.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
            return null;
        }
        
        
        
        
    
}
}
