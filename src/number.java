import java.util.Scanner;
public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner T=new Scanner(System.in);
	
	System.out.println ("Enter a number");
	
	int num = T.nextInt();
	
	String type = Truefalse(num);
	
	System.out.println ("The output is" + type );
	
	}
		
	public static String Truefalse (int y)	{
	
	
		
	if ((y % 2) == 0)
	{
	return "True"  ;
	}
	
	else 
	{
	return "false";
	}

}
}