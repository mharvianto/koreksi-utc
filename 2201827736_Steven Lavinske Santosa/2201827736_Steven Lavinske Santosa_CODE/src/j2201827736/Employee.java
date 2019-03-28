package j2201827736;

public class Employee {
	protected String name;
	protected String address;
	protected String title;
	protected Integer salary = 3850000;

	public Employee() {
		super();
	}

	public Employee(String name, String address, String title) {
		super();
		this.name = name;
		this.address = address;
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTitle() {
		return "NULL";
	}

	public Integer getSalary() {
		return this.salary;
	}

}
