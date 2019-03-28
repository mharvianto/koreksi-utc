package j2201828032;

public class Staff extends Employee {
	private int basicSalary;

	public void employee(String jobTitle) {
		this.name = name;
		this.address = address;
		this.jobTitle = jobTitle;
		this.basicSalary = basicSalary;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int calcuStaffSalary() {
		return 5000000;
	}

	@Override
	public String toString() {
		return "Staff [basicSalary=" + basicSalary + "]";
	}
}
