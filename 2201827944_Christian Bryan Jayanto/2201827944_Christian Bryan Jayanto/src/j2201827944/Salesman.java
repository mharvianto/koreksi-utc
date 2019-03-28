package j2201827944;

public class Salesman extends Pekerja {

	public Salesman(String namaPekerja, String address) {
		this.namaPekerja = namaPekerja;
		this.address = address;
		this.title = "Salesman";
	}

	public void sales_salary(int c_price, int s_price) {
		this.salary += (c_price - s_price);
		System.out.println("The salary of " + this.namaPekerja + " is " + this.salary);
	}

	@Override
	public String toString() {
		return "Salesman [nama Pekerja=" + namaPekerja + ", address= " + address + ", salary=" + salary + ", title="
				+ title + "]";
	}

}
