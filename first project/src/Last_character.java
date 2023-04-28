import java.util.Scanner;
public class Last_character {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int count;
		char temp,max='\0';
		System.out.println("size:");
		int size=sc.nextInt();
		char[] arr=new char[size];
	
		//array input
		for(int i=0;i<size;i++)
			
		{
			arr[i]=sc.next().charAt(0);
		}
		int n=sc.nextInt();
		
		
		for(int i=0;i<size;i++)
		{
			count=0;
			for(int j=i;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					
				}
				
			}
			if(n==count)			
			  max=arr[i];
			
			 
		}	
		if(max!='\0')
		   System.out.println(max);
		else
			System.out.println(-1);
    
	}

}

