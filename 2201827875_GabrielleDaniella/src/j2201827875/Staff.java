package j2201827875;

public class Staff extends Employee {
	private Integer basicSal;

	public Staff(String name, String address, String jobTitle) {
		super(name, address, jobTitle);
	}

	public Staff() {

	}

	@Override
	public void showData() {
		System.out.println("Name: " + getName());
		System.out.println("Adress: " + getAddress());
		System.out.println("Job: " + getJobTitle());
		System.out.println("Salary: " + getBasicSal());
	}

	public Integer getBasicSal() {
		return 3500000;
	}
}
