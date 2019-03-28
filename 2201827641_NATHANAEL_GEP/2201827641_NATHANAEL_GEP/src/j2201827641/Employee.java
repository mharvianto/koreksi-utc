package j2201827641;

public class Employee {

	protected String name;
	protected String address;
	protected String title;

	public Integer countSalary() {
		return 0;
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
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Employee(String name, String address, String title) {
		super();
		this.name = name;
		this.address = address;
		this.title = title;
	}

	public Employee() {

	}

}
