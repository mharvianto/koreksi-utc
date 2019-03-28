package j2201827925;

public class Employee {

	protected String nama;
	protected String address;
	protected String title;
	protected int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {

	}

	public Employee(String nama, String address, String title, int salary) {
		super();
		this.nama = nama;
		this.address = address;
		this.title = title;
		this.salary = salary;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Employee\nnama = " + nama + "\naddress = " + address + "\ntitle = " + title + "\nsalary = Rp" + salary;
	}

	public String toString(String nama, String address, String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
