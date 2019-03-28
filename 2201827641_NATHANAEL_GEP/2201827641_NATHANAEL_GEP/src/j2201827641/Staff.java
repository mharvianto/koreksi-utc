package j2201827641;

public class Staff extends Employee {

	private Integer salary;

	@Override
	public Integer countSalary() {

		return this.salary;
	}

	public Integer getSalary() {
		return salary;
	}

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String address, String title) {
		super(name, address, title);
		this.salary = 2500000;
	}

}
