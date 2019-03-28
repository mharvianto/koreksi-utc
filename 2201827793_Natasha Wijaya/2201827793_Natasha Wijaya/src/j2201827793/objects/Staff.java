package j2201827793.objects;

public class Staff extends Employee {

	private int salary;

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String address, String jobTitle) {
		super(name, address, "Staff");
		this.salary = 5000000;
	}

	public int getSalary() {
		return salary;
	}

}
