package j2201827843.company;

public class Employee {
	protected String name;
	protected String address;
	protected String jobTitle;
	protected Integer sallary;

	public Employee(String name, String address, String jobTitle, Integer sallary) {
		super();
		this.name = name;
		this.address = address;
		this.jobTitle = jobTitle;
		this.sallary = sallary;
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

	public Integer getSallary() {
		return this.sallary;
	}

	public void setSallary(Integer sallary) {
		this.sallary = sallary;
	}
}
