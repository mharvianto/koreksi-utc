package j2201827710;

public class Staff extends Employee {

	public Staff(String name, String adress) {
		// default salary Rp4000000
		super(name, adress, "Staff", 4000000);

	}

	public Staff() {

	}

	@Override
	public String toString() {

		return String.format("Staff's Stat\n=======\nName :%s\nJob:%s\nAdress:%s\nSalary:%d\n", name, jobTitle, adress,
				salary);
	}
}
