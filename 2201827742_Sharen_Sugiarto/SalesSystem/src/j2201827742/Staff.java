package j2201827742;

import java.util.Vector;

public class Staff extends Employee {
	private String jobName;

	public Staff() {
		this.address = address;
		this.jobName = "Salesman";
		this.name = name;
		this.salary = 5000000;

	}

	public Staff(String name, String address) {
		super(name, address);
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	@Override
	public String toString() {
		return "Staff [jobName=" + jobName + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

}
