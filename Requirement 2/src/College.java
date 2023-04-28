import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class College 
{
	private String name;
    private String website;
	private String mobile;
	private String founder;
	private int noOfDept;
	private String location;
	private Date startingDate;
	public College() {}
	public College(String name, String website, String mobile, String founder, int noOfDept, String location,
			Date startingDate) 
	{
		super();
		this.name = name;
		this.website = website;
		this.mobile = mobile;
		this.founder = founder;
		this.noOfDept = noOfDept;
		this.location = location;
		this.startingDate = startingDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public int getNoOfDept() {
		return noOfDept;
	}
	public void setNoOfDept(int i) {
		this.noOfDept = i;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}
	

			public static College createCollege(String detail) throws ParseException
			{
				//Scanner sc=new Scanner(System.in);
				//detail =sc.nextLine();
				SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
				College college=new College();
				String[] arr=detail.split(",");
				college.setName(arr[0]);
				college.setWebsite(arr[1]);
				college.setMobile(arr[2]);
				college.setFounder(arr[3]);
				college.setNoOfDept(Integer.parseInt(arr[4]));
				college.setLocation(arr[5]);
				college.setStartingDate(sdf.parse(arr[6]));
				return college;
				
				
					
					
				
			}
		}
		
		
	
	

	

