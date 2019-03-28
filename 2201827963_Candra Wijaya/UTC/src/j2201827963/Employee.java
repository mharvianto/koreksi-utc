package j2201827963;

public class Employee {

	protected String name;
	protected String address;
	protected String jobTitle;

	public Employee(String name, String address, String jobTitle) {
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

	public int calculateSalary() {
		return 0;
	}

}
