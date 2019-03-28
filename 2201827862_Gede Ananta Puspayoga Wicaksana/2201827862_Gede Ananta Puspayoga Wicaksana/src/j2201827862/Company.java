package j2201827862;

import java.util.Vector;

public class Company {

	Vector<Employee> employeeList = new Vector<Employee>();
	Vector<Transaction> transactionList = new Vector<Transaction>();

	public Company() {
		simulation();
	}

	public void simulation() {

		Vector<Product> productList = new Vector<Product>();

		Product lipstick = new Product("cosmetic", "Lipstique", 120000, 100000);
		Product lipgloss = new Product("Lip Gloss", "Lip Gloss", 90000, 80000);

		productList.add(lipstick);
		productList.add(lipgloss);

		Employee ananta = new Salesman("Ananta", "Sentul", "Salesman", 1000000, productList);
		Employee puspayoga = new Staff("Puspayoga", "Sentul city", "Staff", 1500000);

		employeeList.add(ananta);
		employeeList.add(puspayoga);

		viewEmployee();

		Transaction tr = new Transaction(3, productList.get(0), ((Salesman) employeeList.get(0)));

		transactionList.add(tr);

		viewTransaction();
		System.out.println();
		viewEmployee();

		Transaction tr2 = new Transaction(2, productList.get(1), ((Salesman) employeeList.get(0)));

		System.out.println();
		viewTransaction();
		System.out.println();
		viewEmployee();

		transactionList.add(tr2);
	}

	public static void main(String[] args) {
		new Company();
	}

	public void viewEmployee() {
		for (Employee emp : employeeList) {
			if (emp instanceof Staff) {
				((Staff) emp).showData();
			} else if (emp instanceof Salesman) {
				((Salesman) emp).showData();
			} else {
				emp.showData();
			}
			System.out.println("=====================");
		}
	}

	public void viewTransaction() {
		for (Transaction tr : transactionList) {
			tr.showData();
			System.out.println("===================");
		}
	}
}
