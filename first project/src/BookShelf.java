import java.util.Scanner; 
public class BookShelf extends Furniture
{
private int noOfShelves;

public BookShelf()
{
	super();
	
}

public BookShelf(int noOfShelves) 
{
	super();
	this.noOfShelves=noOfShelves;
	
}

public int getNoOfShelves() 
{
	return noOfShelves;
}

public void setNoOfShelves(int noOfShelves)
{
	this.noOfShelves = noOfShelves;
}
public void acceptDetails() 
{
	super.acceptDetails();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of shelves: ");
	noOfShelves=sc.nextInt();	
	
}
public void displayDetails() 
{
	super.displayDetails();
	System.out.println("Number of legs: "+ noOfShelves);
	
}

	


}
