package j2201827944;

public class Pekerja {
	protected String namaPekerja;
	protected String address;
	protected int salary;
	protected String title;

	public Pekerja() {
		this.namaPekerja = "";
		this.address = "";
		this.title = "";
	}

	public void staff_salary() {
		salary += 0;
	}

	public void sales_salary(int c_price, int s_price) {
		salary += 0;
	}

	public void countSalary() {
		this.salary = 0;
	}

	public int getSalary() {
		return salary;
	}

	public String getNamaPekerja() {
		return namaPekerja;
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
		return "Pekerja [namaPekerja=" + namaPekerja + ", address=" + address + ", salary=" + salary + ", title="
				+ title + "]";
	}

}
