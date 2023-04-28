package EMPLOYEE;

public class Employee 
{
	private Integer id;
	private String firstName;
	private String lastNmae;
	private Integer salary;
	public Employee() {}
	public Employee(Integer id, String firstName, String lastNmae, Integer salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastNmae = lastNmae;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNmae() {
		return lastNmae;
	}
	public void setLastNmae(String lastNmae) {
		this.lastNmae = lastNmae;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastNmae=" + lastNmae + ", salary=" + salary
				+ "]";
	}
	
	

}
