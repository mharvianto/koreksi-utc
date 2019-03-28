package j2201827723;

public class Staff extends Employee {
	public void setAll(String name, String address, String job_title, int salary) {
		this.name = name;
		this.address = address;
		this.job_title = job_title;
		this.salary = salary;
	}

	Staff(String name, String address, String job_title, int salary) {
		super(name, address, job_title);
		this.salary = salary;
	}
}
