package j2201827704;

public class Staff extends Employee {

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String address, String jobTitle) {
		super(name, address, jobTitle);
	}

	public void calculateSalary(int salary) {
		System.out.printf("%s has receive Rp %7d,00 salary!", this.name, salary);
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", address=" + address + ", jobTitle=" + jobTitle + "]";
	}

}
