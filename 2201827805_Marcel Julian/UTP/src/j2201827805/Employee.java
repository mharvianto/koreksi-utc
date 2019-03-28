package j2201827805;

public class Employee {
	protected String name;
	protected String address;
	protected String jobTitle;
	protected int salary;

	public Employee(String name, String address, String jobTitle) {
		this.name = name;
		this.address = address;
		this.jobTitle = jobTitle;
	}

	public String toString() {
		return name + " - " + jobTitle + "\n" + "Gaji: " + salary;
	}

	public String getData() {
		return name + " - " + address + " - " + jobTitle;
	}

	public int countSalary() {
		return salary;
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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
