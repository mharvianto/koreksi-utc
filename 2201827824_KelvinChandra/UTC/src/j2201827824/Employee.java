package j2201827824;

public class Employee {
	protected String name;
	protected String address;
	protected String jobTitle;
	protected int gaji = 0;

	public Employee() {

	}

	public Employee(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		this.jobTitle = jobTitle;
		this.gaji = gaji;
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

	public int getGaji() {
		return gaji;
	}

	public int hitungGaji() {
		return gaji;
	}

}
