import java.util.Scanner;
public class Mileage {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double price,dist;
		int amt;
	    price=sc.nextDouble();
	    dist=sc.nextDouble();
	    amt=sc.nextInt();
	    double litres=(double) amt/price;
	    double mileage=dist/litres;
	    System.out.format("Mileage:%.2f",mileage);
	    
		
		
		
		
	}

}
