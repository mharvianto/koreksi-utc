package j2201827830;

public class Staff extends Employee {

	public Staff() {
		super();
	}

	public Staff(String name, String address, int basicSalary) {
		super(name, address, "Staff", basicSalary);
	}

	@Override
	public int calculateSalary() {
		return basicSalary;
	}
}
