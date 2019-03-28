package j2201827976;

public class Employee {
	protected String name;
	protected String address;
	protected String job_title;
	protected int salary;

	public Employee(String name, String address, String job_title, int salary) {
		super();
		this.name = name;
		this.address = address;
		this.job_title = job_title;
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

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
