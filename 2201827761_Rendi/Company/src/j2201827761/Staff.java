package j2201827761;

public class Staff extends Employee {

	protected Integer salary;

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(Integer salary) {
		super();
		this.salary = salary;
	}

	public Staff(String name, String address, String job, Integer salary) {
		super(name, address, job);
		this.salary = salary;
	}

	// method

	@Override
	public Integer totalSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

	// setter and getter

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

}
