package j2201827641;

import java.util.Vector;

public class Company {

	private String name;
	private static Vector<Employee> listEmployee = new Vector<>();
	private static Vector<Product> listProduct = new Vector<>();

	public static void viewEmployee(Vector<Employee> list) {
		for (Employee employee : list) {
			System.out.println(employee.getName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Vector<Employee> getListEmployee() {
		return listEmployee;
	}

	public static Vector<Product> getListProduct() {
		return listProduct;
	}

	public Company(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		// add employee
		Company mabelin = new Company("MABELIN");

		Staff ita = new Staff("ITA", "JL BANGO", "STAFF");
		getListEmployee().add(ita);

		Salesman adi = new Salesman("ADI", "JL BIRU", "SALESMAN");
		getListEmployee().add(adi);

		viewEmployee(getListEmployee());

		System.out.println(ita.countSalary());

		// add product
		Product a123 = new Product("LIPSTIK MERAH", "LIPSTIK", 200000, 100000);
		listProduct.add(a123);
		Product b456 = new Product("BEDAK HALUS", "BEDAK", 300000, 200000);
		listProduct.add(b456);
		Product c789 = new Product("BRUSH KECIL", "BRUSH", 400000, 300000);
		listProduct.add(c789);
		Product d000 = new Product("BLUSH ON PEKAT", "BLUSH ON", 500000, 400000);
		listProduct.add(d000);

		// salesman sales

		adi.sell(a123);
		adi.sell(b456);
		adi.closeTransaction();

		adi.sell(c789);
		adi.sell(d000);
		adi.closeTransaction();

		adi.viewSoldPricePerTransaction();

		System.out.println(adi.countSalary());

	}

}
