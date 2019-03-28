package j2201827830;

public class Employee {
	protected String name;
	protected String address;
	protected String jobTitle;
	protected int basicSalary;

	public Employee() {
		name = "";
		address = "";
		jobTitle = "";
		basicSalary = 0;
	}

	public Employee(String name, String address, String jobTitle, int basicSalary) {
		super();
		this.name = name;
		this.address = address;
		this.jobTitle = jobTitle;
		this.basicSalary = basicSalary;
	}

	public int calculateSalary() {
		return 0;
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

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

}
