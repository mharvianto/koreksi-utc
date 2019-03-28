package j2201827995.model;

public class Staff extends Employee {

	public Staff(String name, String address, String job) {
		super(name, address, job);
	}

	@Override
	public int getSalary() {
		return 2000000;
	}
}
