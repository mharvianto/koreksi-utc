package j2201827862;

public class Staff extends Employee {

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String address, String jobTitle, long salary) {
		super(name, address, jobTitle, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public long getSalary() {
		return super.getSalary();
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		super.showData();
		System.out.println("Salary : " + getSalary());
	}
}
