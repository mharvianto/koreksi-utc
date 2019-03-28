package j2201827976;

public class Staff extends Employee {

	public Staff(String name, String address, String job_title, int salary) {
		super("Raphiel", "Jl. Sepi Karya", "Staff", 5000000);
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", address=" + address + ", job_title=" + job_title + ", salary=" + salary + "]";
	}

}
