package j2201827654;

public class Employee {

	protected String name;
	protected int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

//	public void hitungSalary(int nominal){
//		salary =+ nominal;
//	}

	public Employee() {
	}

}
