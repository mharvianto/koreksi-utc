package j2201827912;

public class Employee {
	protected String name;
	protected String address;
	protected String job;
	protected int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public void calculateSalary(int profit) {

	}

	public void showSalary() {
		System.out.println(this.name + " Salary(" + this.job + "): " + this.salary);
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
