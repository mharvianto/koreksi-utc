package j2201827673;

public class Staff extends Employee {

	public Staff(String name, String address) {
		super(name, address, "Staff");
		this.salary = 3000000;
	}

	@Override
	public void calculateSalary() {
		System.out.printf("Gaji %s - %s\n", name, jobTitle);
		System.out.printf("Gaji pokok %d\n", salary);
		System.out.printf("Total %d", salary);
	}

}
