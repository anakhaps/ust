import java.util.Scanner;
public class Chair extends Furniture 
{
 private static int noOfLegs;
 
 
	
	public Chair()
	{
	
	
    }

	public Chair(int noOfLegs)
	{
		super();
		this.noOfLegs=noOfLegs;
	}
	
	
public static int getNoOfLegs() {
		return noOfLegs;
	}

	public static void setNoOfLegs(int noOfLegs) {
		Chair.noOfLegs = noOfLegs;
	}
public void acceptDetails() 
{
	super.acceptDetails();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of legs: ");
	noOfLegs=sc.nextInt();	
	
}
public void displayDetails() 
{
	super.displayDetails();
	System.out.println("Number of legs: "+ noOfLegs);
	
}

	


}
