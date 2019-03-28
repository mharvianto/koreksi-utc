package j2201827761;

public class Employee {

	protected String name;
	protected String address;
	protected String job;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String address, String job) {
		this.name = name;
		this.address = address;
		this.job = job;
	}

	public Integer totalSalary() {
		return 0;
	}

	// setter and getter
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
