package j2201827931;

public class Employee {
	protected String name;
	protected String address;
	protected int totalSalary;

	public Employee(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getTotalSalary() {
		return totalSalary;
	}

}
