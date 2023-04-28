import java.text.SimpleDateFormat;
import java.util.Scanner;

public class college 
{   public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter college 1 detail:");
	String detail1=sc.nextLine();
	System.out.println("Enter college 2 detail:");
	String detail2=sc.nextLine();
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	
	String[] arr1 = detail1.split(",");
	requirenment_java req=new requirenment_java();
	req.setName(arr1[0]);
	req.setWebsite(arr1[1]);
	req.setMobile(arr1[2]);
	req.setFounder(arr1[3]);
	req.setNumberOfDept(Integer.valueOf(arr1[4]));
	req.setLocation(arr1[5]);
//	req.setStartingDate(sdf.parse(arr1[6]));
	
	String[] arr2 = detail2.split(",");
	college college2=new college();
	req.setName(arr2[0]);
	req.setWebsite(arr2[1]);
	req.setMobile(arr2[2]);
	req.setFounder(arr2[3]);
	req.setNumberOfDept(Integer.valueOf(arr2[4]));
	req.setLocation(arr2[5]);
//	req.setStartingDate(sdf.parse(arr2[6]));
	
	System.out.println("College 1:");
	System.out.println(req);
	System.out.println();
	System.out.println("College 2:");
//	System.out.println(req1);
	
}

}



	

	
