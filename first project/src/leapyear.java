import java.util.GregorianCalendar;
import java.util.Scanner;

public class leapyear
{
   public static void main(String args[]) 
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a year:");
   GregorianCalendar gc=new GregorianCalendar();
   int yr=sc.nextInt();
   if(gc.isLeapYear(yr))
   {
	   System.out.println("Leap year");
   }
   else
   {
	   System.out.println("Not a leap year");
   }
   


   }
}
