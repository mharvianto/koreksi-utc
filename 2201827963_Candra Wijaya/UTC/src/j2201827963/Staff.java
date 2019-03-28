package j2201827963;

public class Staff extends Employee {

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Staff(String name, String address, String jobTitle, int salary) {
		super(name, address, jobTitle);
		setSalary(3850000);
		this.salary = getSalary();
	}

}
