package j2201828032;

public class Employee {
	protected String name;
	protected String address;
	protected String jobTitle;

	public Employee() {// default constractor

	}

	public Employee(String name, String address, String jobTitle) {// constractor
		super();
		this.name = name;
		this.address = address;
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public int calcuStaffSalary() {
		return 0;
	}

	public int calcuSalesmanSalary() {
		return 0;
	}

}
