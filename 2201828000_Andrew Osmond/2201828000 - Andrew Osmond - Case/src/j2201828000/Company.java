package j2201828000;

import java.util.ArrayList;

public class Company {
	private ArrayList<Product> arrProduct = new ArrayList<Product>();
	private ArrayList<Employee> arrEmployee = new ArrayList<Employee>();
	private ArrayList<Transaction> arrTransaction = new ArrayList<Transaction>();

	public ArrayList<Product> getArrProduct() {
		return arrProduct;
	}

	public ArrayList<Employee> getArrEmployee() {
		return arrEmployee;
	}

	public ArrayList<Transaction> getArrTransaction() {
		return arrTransaction;
	}

	public static void main(String[] args) {
		Company Aoisora = new Company();
		Employee staff = new Staff("Nico", "Jl. Batanghari", "Staff");
		Employee salesman = new Salesman("Kevin", "Jl. Alam Jelita", "Salesman");
		Aoisora.getArrEmployee().add(staff);
		Aoisora.getArrEmployee().add(salesman);

		Product p1 = new Product("Masker", "Face", 50000, 45000);
		Product p2 = new Product("Pembersih Muka", "Face", 30000, 21000);
		Product p3 = new Product("Minyak Wangi", "Body", 44000, 17000);
		Product p4 = new Product("Alis Mata", "Eye", 100000, 66000);
		Product p5 = new Product("Sarung Tangan", "Hand", 55000, 30000);
		Product p6 = new Product("Skin Lotion", "Skin", 98000, 22000);
		Aoisora.getArrProduct().add(p1);
		Aoisora.getArrProduct().add(p2);
		Aoisora.getArrProduct().add(p3);
		Aoisora.getArrProduct().add(p4);
		Aoisora.getArrProduct().add(p5);
		Aoisora.getArrProduct().add(p6);

		// Transaksi 1
		ArrayList<Product> arrCart = new ArrayList<Product>();
		ArrayList<Integer> arrQuantity = new ArrayList<Integer>();
		arrCart.add(p1);
		arrCart.add(p2);
		arrCart.add(p3);
		arrCart.add(p4);
		arrQuantity.add(10);
		arrQuantity.add(5);
		arrQuantity.add(2);
		arrQuantity.add(5);

		Transaction transaction1 = new Transaction(new Date(21, 03, 2019), arrCart, arrQuantity);
		Aoisora.getArrTransaction().add(transaction1);
		((Salesman) salesman).addTransaction(transaction1);

		// Transaksi 2
		arrCart = new ArrayList<Product>();
		arrQuantity = new ArrayList<Integer>();
		arrCart.add(p1);
		arrCart.add(p5);
		arrCart.add(p6);
		arrQuantity.add(8);
		arrQuantity.add(7);
		arrQuantity.add(5);

		Transaction transaction2 = new Transaction(new Date(), arrCart, arrQuantity);
		Aoisora.getArrTransaction().add(transaction2);
		((Salesman) salesman).addTransaction(transaction2);

		System.out.println(staff);
		System.out.println(salesman);
		((Salesman) salesman).viewTransaction();
	}
}
