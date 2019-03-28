package j2201827736;

public class Staff extends Employee {

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String address) {
		super(name, address, "Staff");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Staff";
	}

}
