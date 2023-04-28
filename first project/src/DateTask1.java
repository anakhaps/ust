import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DateTask1 
{
public static void main(String args[]) throws ParseException
{
	          Scanner sc=new Scanner(System.in);
		      System.out.println("Enter date in dd/mm/yyyy");
		      String ip=sc.nextLine();
		      Date doj=new Date();
		      SimpleDateFormat sf=new SimpleDateFormat("dd/mm/yyyy");
		      sf.setLenient(false);
		      doj=sf.parse(ip);
		      System.out.println(doj);
		      System.out.println(sf.format(doj));
		      
		
			
}

	
}
