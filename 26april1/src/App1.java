import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(12,92,5,100,82);
		List<Integer> result=(List<Integer>) numbers.stream()
		.filter(a->a>80)
		.sorted((a,b)->a.compareTo(b))
		.collect(Collectors.toList());
		 System.out.println(result);

	}

}