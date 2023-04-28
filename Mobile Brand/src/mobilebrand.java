import java.util.List;

public class mobilebrand 
{
 private String name;
 private List<Mobile> mobileList;
 public mobilebrand() {}
public mobilebrand(String name, List<Mobile> mobileList) 
{
	super();
	this.name = name;
	this.mobileList = mobileList;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Mobile> getMobileList() {
	return mobileList;
}
public void setMobileList(List<Mobile> mobileList) {
	this.mobileList = mobileList;
} 
 
	

}

