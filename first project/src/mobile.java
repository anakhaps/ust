import java.util.Date;
public class mobile {
	
		
	private String referenceeld;
	private String modelName;
	private double displaySize;
	private double Price;
	private Date launchedDate;
	public mobile() {
	
		// TODO Auto-generated constructor stub
	}
	public mobile(String referenceeld, String modelName, double displaySize, double price, Date launchedDate) {
		super();
		this.referenceeld = referenceeld;
		this.modelName = modelName;
		this.displaySize = displaySize;
		Price = price;
		this.launchedDate = launchedDate;
	}
	public String getReferenceeld() {
		return referenceeld;
	}
	public void setReferenceeld(String referenceeld) {
		this.referenceeld = referenceeld;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public double getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public Date getLaunchedDate() {
		return launchedDate;
	}
	public void setLaunchedDate(Date launchedDate) {
		this.launchedDate = launchedDate;
	}
	@Override
	public String toString() {
		return "mobile [referenceeld=" + referenceeld + ", modelName=" + modelName + ", displaySize=" + displaySize
				+ ", Price=" + Price + ", launchedDate=" + launchedDate + ", getReferenceeld()=" + getReferenceeld()
				+ ", getModelName()=" + getModelName() + ", getDisplaySize()=" + getDisplaySize() + ", getPrice()="
				+ getPrice() + ", getLaunchedDate()=" + getLaunchedDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
