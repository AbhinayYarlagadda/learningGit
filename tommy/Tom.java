package tommy;
import  static java.lang.System.out;




/**
 * @author superstarcruise
 *
 */
public class Tom //Created class named Tom
{
	
	protected static String S="James Bond 007";
	protected static String disp()//Method Initialization
	{
		return S;//returns the value of String S
}	

		
	
	public Tom() //Constructor creation
	{
		
		out.println(Tom.disp());
	}
	

	
	
	 public static void main(String[] args) 
	{
		
Tom t= new Tom();//object initialization and calling default constructor

	}
	

}

