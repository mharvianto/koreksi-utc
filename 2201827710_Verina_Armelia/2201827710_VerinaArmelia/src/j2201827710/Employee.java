package j2201827710;

public class Employee {
	protected String name, adress, jobTitle;
	protected int salary;

	public Employee(String name, String adress, String jobTitle, int salary) {
		super();
		this.name = name;
		this.adress = adress;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
