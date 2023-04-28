package Task3;

public class Employee 
{
	private Integer id;
	private String firstName;
	private String lastNmae;
	private Double salary;
	private String department;
	public Employee() {}
	public Employee(Integer id, String firstName, String lastNmae, Double salary, String department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastNmae = lastNmae;
		this.salary = salary;
		this.department = department;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastNmae=" + lastNmae + ", salary=" + salary
				+ ", department=" + department + "]";
	}
	
	
	
	
	

}
