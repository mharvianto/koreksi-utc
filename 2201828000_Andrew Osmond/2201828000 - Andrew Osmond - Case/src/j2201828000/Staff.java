package j2201828000;

public class Staff extends Employee {

	public Staff(String name, String address, String jobTitle) {
		super(name, address, jobTitle);
	}

	@Override
	public int getSalary() {
		return basicSalary;
	}

	@Override
	public String toString() {
		return "Staff Data\n" + super.toString() + String.format("Salary: %d\n", getSalary());
	}
}
