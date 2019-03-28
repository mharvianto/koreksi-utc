package j2201827742;

import java.util.Vector;

public class Company {

	Vector<Employee> vEmployee = new Vector<>();

	public Vector<Employee> getvEmployee() {
		return vEmployee;
	}

	public static void main(String[] args) {
		Company a = new Company();

		Employee andi = new Employee("Andi", "Jl. Lalaland");

		a.getvEmployee().add(andi);

		Product j = new Product("lipstick", "lip", 50000, 30000);

	}
}
