package j2201827793.objects;

import java.util.Vector;

import j2201827793.objects.Staff;

public class Company {
	public static Vector<Product> productList = new Vector<>();
	public static Vector<Employee> employeeList = new Vector<>();
	public static Vector<Transaction> transactionList = new Vector<>();

	static {
		productList.add(new Product("Foundation Mahal", 5000000, 3200000));
		productList.add(new Product("Eyeshadow Mahal", 3800000, 2100000));
		productList.add(new Product("Blush Mahal", 4900000, 3250000));
		productList.add(new Product("Mascara Mahal", 5600000, 4000000));
		productList.add(new Product("Lipstick Mahal", 36500000, 20500000));

		employeeList.add(new Staff("Bambang", "Jalan Lurus no. 1", "Staff"));
		employeeList.add(new Salesman("Fergusso", "Jalan Berbelok no. 2", "Salesman"));
	}

	public static String custName;

	public void buyItem(int index) {
		Transaction temp = new Transaction(Company.custName, productList.get(index - 1).getName(),
				productList.get(index - 1).getSellPrice());
		transactionList.add(temp);
	}

	public static int totalPrice() {
		int total = 0;
		for (Transaction trans : transactionList) {
			total += trans.getPrice();
		}
		return total;
	}

	public static void viewItem() {
		int i = 1;
		for (Product prod : productList) {
			System.out.println(i++ + ". " + prod.getName() + prod.getPrice());
		}
	}

	public static void viewTransaction() {
		int i = 1;
		for (Transaction trans : transactionList) {
			System.out.println(i++ + ". " + trans.getCustName() + "	" + trans.getItem() + "	" + trans.getPrice());
		}
	}

	public static void main(String[] args) {
		new Company();

		Company Boby = new Company();

		Company.custName = "Boby";

		System.out.println("This is " + Company.custName);
		System.out.println();

		System.out.println("Item List");
		System.out.println("=-=-=-=-=-=-=-=");
		viewItem();

		Boby.buyItem(1);
		System.out
				.println("\nBoby buys a " + productList.get(0).getName() + " for Rp " + productList.get(0).getPrice());
		Boby.buyItem(3);
		System.out.println("Boby buys a " + productList.get(2).getName() + " for Rp " + productList.get(2).getPrice());
		Boby.buyItem(4);
		System.out.println("Boby buys a " + productList.get(3).getName() + " for Rp " + productList.get(3).getPrice());
		Boby.buyItem(5);
		System.out.println("Boby buys a " + productList.get(4).getName() + " for Rp " + productList.get(4).getPrice());

		System.out.println("\nThis is Boby's bill");
		viewTransaction();

		System.out.println("\nThe Store has been Closed");
		System.out.println("Salary Time !");
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}

	}

}
