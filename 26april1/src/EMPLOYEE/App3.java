package EMPLOYEE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App3 {

	public static void main(String[] args) 
	{
	  List<Employee> li=new ArrayList<Employee>();
      Employee emp=new Employee();
      Scanner sc=new Scanner(System.in);
      Scanner sc1=new Scanner(System.in);
      System.out.println("Enter the number of Employees");
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
    	  Integer id=sc.nextInt();
    	  emp.setId(id);
    	  String firstName=sc1.nextLine();
    	  emp.setFirstName(firstName);
    	  String lastName=sc1.nextLine();
    	  emp.setLastNmae(lastName);
    	  int salary=sc.nextInt();
    	  emp.setSalary(salary);
    	  li.add(emp);
    	  
    	  
    	  
      
      System.out.println(li);
      }
      
	}

}
