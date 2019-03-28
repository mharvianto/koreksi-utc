package j2201828064;

public class Staff extends Employee {

	private int salary;
	private int uang;

	public Staff(String name, String address, String jobTitle, int salary) {
		super(name, address, jobTitle);
		this.salary = salary;
		this.uang = 0;
	}

	public int getSalary() {
		return salary;
	}

	public int getUang() {
		return uang;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void gajian() {
		uang += salary;
	}

	@Override
	public String toString() {
		return "Staff [salary=" + salary + ", uang=" + uang + ", name=" + name + ", address=" + address + ", jobTitle="
				+ jobTitle + "]";
	}
}
