package j2201827862;

public class Employee {
	protected String name;
	protected String address;
	protected String jobTitle;

	protected long salary;

	public long getSalary() {
		return salary;
	}

	public Employee() {

	}

	public Employee(String name, String address, String jobTitle, long salary) {
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

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public void showData() {
		System.out.println("Name : " + name);
		System.out.println("Job Title : " + jobTitle);
		System.out.println("Address : " + address);
	}
}
