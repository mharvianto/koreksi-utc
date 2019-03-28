package j2201827982;

public class Staff extends Employee {

	private long salary;

	public Staff() {
		this.money = 0;
	}

	public Staff(String name, String address) {
		super(name, address, "Staff");
		this.salary = 380;
		this.money = 0;
		System.out.println(name + " is a Staff");
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public void receiveSalary() {
		super.receiveSalary();
	}
}
