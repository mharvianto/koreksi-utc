package j2201827894;

import java.util.ArrayList;

public class Employee {
	protected String name;
	protected String address;
	protected String jobTitle;
	protected Integer salary = 0;
	protected Integer standardSalary = 1000000;

	public Employee() {

	}

	public void add(ArrayList<Employee> eList, String name, String address) {

	}

	public void calculateSalary(Employee a) {

	}

	public Employee(String name, String address, String jobTitle) {
		super();
		this.name = name;
		this.address = address;
		this.jobTitle = jobTitle;
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

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

}
