package j2201827931;

public class Staff extends Employee {
	private int basicSalary;

	public Staff(String name, String address) {
		super(name, address);
		this.basicSalary = 2000000;
	}

	public int getTotalSalary() {
		return basicSalary;
	}

	@Override
	public String toString() {
		return name + " ( " + address + " ) | Staff\n" + "Total Salary: " + getTotalSalary();
	}

}
