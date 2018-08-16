package hollywood;
import java.sql.*; 
import java.sql.Connection;
import java.sql.Driver;
public class Select {
//private static final String TIME_ZONE_MAPPINGS_RESOURCE = null;

public static void main(String args[]){  
	 try (Connection con=DriverManager.getConnection(  
			 "jdbc:mysql://localhost:3306/HOLLYWOOD?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","rootpassword"); ){  
Class.forName("com.mysql.cj.jdbc.Driver");  
 
//here HOLLYWOOD is database name, root is username and rootpassword is password  



Statement stmt=con.createStatement();  

ResultSet rs=stmt.executeQuery("select * from SUPERSTAR ");  
while(rs.next())  
System.out.println(rs.getInt(1) +" "+ rs.getString(2)+ " "+rs.getString(3));  
  
}catch(Exception e){ System.out.println(e);}  
}  
 
}




