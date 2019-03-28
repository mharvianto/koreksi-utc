package j2201827660;

public class Staff extends Employee {

	public Staff() {
		super();
	}

	public Staff(String name, String address, String jobTitle) {
		super(name, address, jobTitle);
	}

	@Override
	public int getSalary() {
		salary = 5000000;
		return super.getSalary();
	}

}
