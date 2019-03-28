package j2201828051;

public class Employee extends Company {

	protected String address;
	protected String jobTitle;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void soldProduct() {
		System.out.println(super.getTotalSold() + " product sold");
	}

	public Employee() {

	}

	public Employee(String address, String jobTitle, String name) {
		super();
		this.address = address;
		this.jobTitle = jobTitle;
		this.name = name;
	}

}
