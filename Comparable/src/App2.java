import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Anakha", "PS", "Ernakulam"));
		empList.add(new Employee(2, "Anand", "Ajay", "Kollam"));
		empList.add(new Employee(21, "Athira", "Radhakrishnan", "Alapuzha"));
		empList.add(new Employee(15, "Neethu", "Rathimohan", "Thrissur"));
		empList.add(new Employee(8, "Sidharth", "Sanil", "Ernakulam"));
		empList.add(new Employee(16, "Krishna", "Syam", "Trivandrum"));
		
		Collections.sort(empList);
		
		for(Employee e : empList)
		{
			System.out.println(e);
		}
	}

}