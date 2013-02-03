
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


public class Gestione_db {

	public static void main (String[] args) {
        try {
        	System.out.println("ciao0");
        	Class.forName("com.mysql.jdbc.Driver");
        	System.out.println("MySQL JDBC driver loaded ok.");
        	System.out.println("ciao1");
        	String url = "jdbc:mysql://localhost:3306/ciao1?"
        					+ "user=zzairaa&password=manola87";
        	System.out.println("ciao2");
            Connection conn = DriverManager.getConnection(url,"zzairaa","manola87");
        	
//            Statement stmt = conn.createStatement();
//            ResultSet rs;
 // 
//            rs = stmt.executeQuery("SELECT Lname FROM Customers WHERE Snum = 2001");
//            while ( rs.next() ) {
//                String lastName = rs.getString("Lname");
//                System.out.println(lastName);
//            }
            
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM famiglia");
           
            ResultSet result = statement.executeQuery();
            while(result.next()){
            	System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
            }
            
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());

        }
    }
}