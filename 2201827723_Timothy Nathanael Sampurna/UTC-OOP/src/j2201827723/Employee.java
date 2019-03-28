package j2201827723;

public class Employee {
	protected String name;
	protected String address;
	protected String job_title;
	protected int salary = 0;

	public void view_salary() {
		System.out.println("Salary: " + salary);
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

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee : \nname=" + name + "\naddress=" + address + "\njob_title=" + job_title + "\nsalary=" + salary;
	}

	public void setAll(String name, String address, String job_title) {
		this.name = name;
		this.address = address;
		this.job_title = job_title;
	}

	public void count_salary() {
		return;
	}

	Employee(String name, String address, String job_title) {
		setAll(name, address, job_title);
	}

	Employee() {

	}
}
