package j2201827654;

public class Salesman extends Employee {

	private String name;

	public Salesman(String name, int salary, String name2) {
		super(name, salary);
		name = name2;
	}

	public Salesman() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
