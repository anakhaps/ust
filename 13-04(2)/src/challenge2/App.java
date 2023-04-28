package challenge2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of colleges:");
		int n=sc.nextInt();
		List<Requirement6> collegeList=new ArrayList<Requirement6>();
		
		for(int i=0;i<n;i++)
		{
			String detail=sc.nextLine();		
			if(detail.equals(""))
				detail=sc.nextLine();
			
			String[] arr = detail.split(",");
			Requirement6 requirement=new Requirement6();
			requirement.setName(arr[0]);
			requirement.setWebsite(arr[1]);
			requirement.setMobile(arr[2]);
			requirement.setFounder(arr[3]);
			requirement.setNumberOfDept(Integer.valueOf(arr[4]));
			requirement.setLocation(arr[5]);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			requirement.setCreatedDate(sdf.parse(arr[6]));
			
			collegeList.add(requirement);
		}
		
		Map<String,Integer> result =Requirement6.calculateLocationCount(collegeList);
		
		System.out.format("%-15s %s\n","Location","Count");
		for(Entry<String, Integer> e:result.entrySet())
			System.out.format("%-15s %s\n",e.getKey(),e.getValue());
	}

}

	
