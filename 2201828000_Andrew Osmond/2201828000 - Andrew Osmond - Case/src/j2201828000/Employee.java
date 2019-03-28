package j2201828000;

public class Employee {
	protected String name;
	protected String address;
	protected String jobTitle;
	protected final int basicSalary = 3000000;

	public Employee(String name, String address, String jobTitle) {
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

	public int getSalary() {
		return basicSalary;
	}

	@Override
	public String toString() {
		return String.format("Name : %s\nAddress : %s\nJob Title : %s\n", name, address, jobTitle);
	}
}
