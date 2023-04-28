import java.util.Scanner;
public class Historical_era 

{
	public static void main(String[] args)
	{
 Scanner sc=new Scanner(System.in);
 int year=sc.nextInt();
 int yr=(year/100)+1;
 if(yr<=2)
 {
	 System.out.println(yr);
	 System.out.println("Prehistorical period");
 }
 else if(yr<=6)
 {
	 System.out.println(yr);
	 System.out.println("Vedic period");
 }
 else if(yr<=13)
 {
	 System.out.println(yr);
	 System.out.println("Second urbanisation");
 }
 else if(yr<=18) 
 {
	 System.out.println(yr);
	 System.out.println("Early modern period");
 }
 else
 {
	 System.out.println(yr);
	 System.out.println("modern period");
 }
}
}
 

