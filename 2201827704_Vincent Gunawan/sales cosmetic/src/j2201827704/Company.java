package j2201827704;

import java.util.ArrayList;

public class Company {
	static ArrayList<Employee> listEmployee = new ArrayList<>();
	static ArrayList<Transaction> listTransaction = new ArrayList<>();

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Staff Kevin = new Staff("Kevin", "Jl Batanghari 98", "Staff");
		listEmployee.add(Kevin);
		Kevin.calculateSalary(4000000);

		Salesman Andi = new Salesman("Andi", "Jalan Batanghari 97", "Salesman");
		Product lipstick = new Product("Wow Lipstick", "Lipstick", 100000, 60000, 100);
		Product makeup = new Product("Makeup", "Makeup", 150000, 90000, 50);
		listEmployee.add(Andi);
		Andi.getListProduct().add(lipstick);
		Andi.getListProduct().add(makeup);
		// orang beli lipstik
		Customer Shella = new Customer("Shella");
		Andi.soldOut(10, "Wow Lipstick");
		Transaction newTransaction = new Transaction(Andi.getListProduct().get(0).getPriceCostumer(), Shella.getName(),
				10, "17-8-2017");
		listTransaction.add(newTransaction);
		listTransaction.get(0).viewTransCust();

		Andi.calculateSalary();

	}

	public void Buy(Salesman a, Customer b, String name, int quantity) {

	}
//	public void viewTransaction(){
//		for (Transaction transaction : listTransaction) {
//			System.out.println(transaction.);
//		}
//	}
}
