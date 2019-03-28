package j2201827660;

import java.util.ArrayList;

public class Company {

	static ArrayList<Employee> employeeList = new ArrayList<>();
	static ArrayList<Product> productList = new ArrayList<>();
	static ArrayList<Transaction> transactionList = new ArrayList<>();
	static int total;

	public Company() {

	}

	public static void main(String[] args) {
		Company abc = new Company();

		Product lipstick = new Product("Lipstick NYX", "Lipstick", 180000, 140000);
		abc.productList.add(lipstick);
		Product powder = new Product("MAC Powder", "Powder", 400000, 350000);
		abc.productList.add(powder);
		Product blush = new Product("Emina Blush On", "Blush On", 60000, 50000);
		abc.productList.add(blush);

		System.out.println("Product List");
		for (Product product : productList) {
			System.out.println("Product Name : " + product.getProdName());
			System.out.println("Product Category : " + product.getProdCategory());
			System.out.println("Product Price [Customer] : Rp. " + product.getPriceCust());
			System.out.println("Product Price [Salesman] : Rp. " + product.getPriceSales());
			System.out.println("");
		}

		Customer wiwi = new Customer("wiwi");
		Transaction trans1 = new Transaction("Lipstick NYX", "Lipstick", 180000, 140000, "Budi", wiwi);
		abc.transactionList.add(trans1);
		Customer andi = new Customer("andi");
		Transaction trans2 = new Transaction("Lipstick NYX", "Lipstick", 180000, 140000, "Budi", andi);
		abc.transactionList.add(trans2);

		for (Transaction trans : transactionList) {
			total += trans.priceCust - trans.priceSales;
		}
		Transaction.setTotal(total);

		Employee ani = new Staff("Ani", "Kemang Raya", "Staff");
		abc.employeeList.add(ani);
		Employee ita = new Staff("Ita", "Kemanggisan Raya", "Staff");
		abc.employeeList.add(ita);
		Employee bagus = new Salesman("Bagus", "Simprug Raya", "Salesman");
		abc.employeeList.add(bagus);
		Employee lia = new Salesman("Lia", "Gandaria Utara", "Salesman");
		abc.employeeList.add(lia);

		System.out.println("Employee List");
		for (Employee employee : employeeList) {
			System.out.println("Name : " + employee.getName());
			System.out.println("Address : " + employee.getAddress());
			System.out.println("Job Title : " + employee.getJobTitle());
			if (employee instanceof Staff) {
				System.out.println("Salary : Rp. " + ((Staff) employee).getSalary());
			} else if (employee instanceof Salesman) {
				System.out.println("Salary : Rp. " + ((Salesman) employee).getSalary());
			}
			System.out.println("");
		}

	}
}
