import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Sentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		for(char x:input.toCharArray())
		{
			Integer count = map.get(x);
			if(count==null)
				count=0;
			count++;
			map.put(x, count);			
		}
		
		
		for(Entry<Character, Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
	}

}
