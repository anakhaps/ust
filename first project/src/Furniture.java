import java.util.Scanner;
public class Furniture 
{

	
	private static String name;
	private static  String color;
	public Furniture() 
	{
		
		// TODO Auto-generated constructor stub
	}
	public Furniture(String name, String color) 
	{
		super();
		this.name = name;
		this.color = color;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void acceptDetails()
	{
		System.out.println("Enter name:");
		Scanner sc=new Scanner(System.in);
	    name=sc.nextLine();
		System.out.println("Enter color");
		color=sc.nextLine();
	}
	public void displayDetails()
	{
		System.out.println("name: "+name);
		System.out.println("color: "+color);
		
	}
	


public static void main(String[] args)

{
	Furniture furniture=new Furniture();
	furniture.acceptDetails();
    furniture.displayDetails();
}
}
