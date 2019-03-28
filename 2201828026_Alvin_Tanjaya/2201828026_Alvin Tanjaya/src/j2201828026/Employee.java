package j2201828026;

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
	}

	public void calculateSalesman(int salary) {
		this.salary = 0;
	}

}
