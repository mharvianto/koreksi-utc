package j2201827881;

public class Employee {
	protected String name;
	protected String address;
	protected String jobTitle;
	protected int gaji;

	public Employee(String name, String address, String jobTitle) {
		this.name = name;
		this.address = address;
		this.jobTitle = jobTitle;
		this.gaji = 0;
	}

	public void setGaji(int gaji) {
		this.gaji += gaji;
	}

	public int getGaji() {
		return gaji;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("\nName: " + name + "\nAddress: " + address + "\nJob Title: " + jobTitle);
	}
}
