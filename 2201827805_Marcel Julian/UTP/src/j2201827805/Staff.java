package j2201827805;

public class Staff extends Employee {

	public Staff(String name, String address, String jobTitle) {
		super(name, address, jobTitle);
	}

	public int countSalary() {
		salary = 500000;
		return salary;
	}
}
