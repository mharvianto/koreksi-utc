package j2201827950;

public class Staff extends Employee {

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String address, String jobTitle, long salary) {
		super(name, address, jobTitle, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public long calculateSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Name=" + name + "\nAddress=" + address + "\nJob Title=" + jobTitle + "\nSalary=" + salary + "]";
	}

}
