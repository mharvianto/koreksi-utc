package j2201827950;

public class Employee {
	protected String name;
	protected String address;
	protected String jobTitle;
	protected long salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String address, String jobTitle, long salary) {
		super();
		this.name = name;
		this.address = address;
		this.jobTitle = jobTitle;
		this.salary = salary;
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

	public long calculateSalary() {
		return 0;
	}

	@Override
	public String toString() {
		return "Employee name=" + name + "\naddress=" + address + "\njobTitle=" + jobTitle + "\nsalary=" + salary;
	}

}
