import java.util.Arrays;
import java.util.Scanner;
public class N_smallest {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size,n;
		size=sc.nextInt();
		int[] arr=new int[size];
	    n=sc.nextInt();
	    Arrays.sort(arr);
	    for(int i=0;i<size;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println(Arrays.toString(arr));
	   // System.out.println(Arrays.toString(copy)));
	   
	    {
	    	System.out.println(arr[i]);
	    	
	    }
		
		

	}

}
