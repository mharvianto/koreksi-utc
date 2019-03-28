package j2201828051;

public class Staff extends Employee {

	@Override
	public double calculateSalary() {
		System.out.println("Basic salary");
		return 3900;
	}

	public Staff() {
		setJobTitle("Staff");
	}

	public Staff(String address, String name) {
		super(address, "Staff", name);
	}

	@Override
	public String toString() {
		return String.format("%s - %s - %s", this.name, this.address, this.jobTitle);
	}

}
