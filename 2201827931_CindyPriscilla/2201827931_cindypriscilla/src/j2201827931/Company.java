package j2201827931;

import java.util.ArrayList;

public class Company {
	ArrayList<Employee> listEmployee = new ArrayList<>();
	ArrayList<Product> listProduct = new ArrayList<>();
	ArrayList<Transaction> listTransaction = new ArrayList<>();

	public Company() {
		listEmployee.add(new Staff("Cindy Priscilla", "Kelapa Gading"));
		listEmployee.add(new Salesman("Michael", "Cempaka Putih", listTransaction));

		listTransaction.add(new Transaction("Lipbalm", "Wardah", "Customer"));
		for (int i = 0; i < listEmployee.size(); i++) {
			if (listEmployee.get(i) instanceof Staff)
				System.out.println(listEmployee.get(i).toString() + "\n");
			else {
				System.out.println(listEmployee.get(i).toString());
				System.out.println("Penjualan:");
				for (Transaction t : listTransaction) {
					if (!t.isCust())
						System.out.println(t.toString());
				}
				System.out.println("\nCustomer");
				for (Transaction t : listTransaction) {
					if (t.isCust())
						System.out.println(t.toString());
				}
			}
		}
		System.out.println("\n\n\n\nNote:\nCustomer Price = 200.000/pcs");
		System.out.println("Salesman Price = 155.000/pcs");
		System.out.println();
	}

	public static void main(String[] args) {
		new Company();

	}

}
