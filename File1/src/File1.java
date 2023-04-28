import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File1
{
	public static void main(String[] args) throws FileNotFoundException
			{
		      
		      Scanner sc=new Scanner(new File("C:/Users/248738/Desktop/java training/File1/src/Anakh.txt"));
		      String str=sc.nextLine();
		      System.out.println(str);
		      
		      
		      
			}

}
