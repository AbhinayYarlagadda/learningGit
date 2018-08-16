package hollywood;
import java.sql.*; 



public class Insert {
public static void main(String args[]){  
	 try (Connection con=DriverManager.getConnection(  
			 "jdbc:mysql://localhost:3306/HOLLYWOOD?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","rootpassword"))
	//here HOLLYWOOD is database name, root is username and rootpassword is password  
	 {  
Class.forName("com.mysql.cj.jdbc.Driver");  
String s="insert into SUPERSTAR values('24','Sreenivas','Jagan')";
Statement stmt=con.createStatement();  
stmt.executeUpdate(s);
System.out.println("Inserted");  
 
 }
catch(Exception e){ System.out.println(e);}  

}  
 
}

