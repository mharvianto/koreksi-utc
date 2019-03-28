package j2201827660;

public class Employee {

	protected String name;
	protected String address;
	protected String jobTitle;
	protected int salary;

	public Employee() {

	}

	public Employee(String name, String address, String jobTitle) {
		this.name = name;
		this.address = address;
		this.jobTitle = jobTitle;
		this.salary = 0;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public int getSalary() {
		return salary;
	}

}
