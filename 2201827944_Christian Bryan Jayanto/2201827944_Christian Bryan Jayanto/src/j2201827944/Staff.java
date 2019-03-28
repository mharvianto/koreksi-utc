package j2201827944;

public class Staff extends Pekerja {

	public Staff(String namaPekerja, String address) {
		this.namaPekerja = namaPekerja;
		this.address = address;
		this.title = "Staff";
	}

	public void staff_salary() {
		this.salary = 400000;
		System.out.println("The salary of " + this.namaPekerja + " is " + this.salary);
	}

	@Override
	public String toString() {
		return "Staff [nama Pekerja=" + namaPekerja + ", address= " + address + ", salary=" + salary + ", title="
				+ title + "]";
	}

}
