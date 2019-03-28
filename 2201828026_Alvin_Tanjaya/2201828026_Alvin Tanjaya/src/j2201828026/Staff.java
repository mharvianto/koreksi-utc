package j2201828026;

public class Staff extends Employee {
	private int basicSalary;

	public Staff() {
	}

	public Staff(String name, String address, String jobTitle, int basicSalary) {
		super(name, address, jobTitle);
		this.basicSalary = basicSalary;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Staff\n[Salary = " + basicSalary + ", Name = " + name + ", Address = " + address + ", jobTitle="
				+ jobTitle + "]";
	}

}
