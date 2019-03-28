package j2201827906;

public class Employee {
	protected String name;
	protected String address;
	protected String jobTitle;
	protected Integer salary;

	public Employee(String name, String address, String jobTitle, int salary) {
		super();
		this.name = name;
		this.address = address;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
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

}
