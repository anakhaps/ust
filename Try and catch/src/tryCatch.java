
 class tryCatch extends Exception
{
	 public static void calculatePercentage(int x,int y) throws 
	{
		if(x<y && y==8)
		{
			throw DenominatorException("The input 1 must be greater than input 2");
		}
			else
				System.out.println("Percentage: "+(x/y)*100);
		
	}
	 public class tryCatch1
	 { 
	
   public static void main(String[] args)
  {
	  tryCatch1 in=new tryCatch1();
  
 try
 {
	 calculatePercentage(10,5);
 }
 catch(DenominatorException de)
 {
	 System.out.println(de.grtMessage());
 }
 catch(Exception ex)
 {
	 System.out.println("Handles any exceptation");
 }
}
 }
}
