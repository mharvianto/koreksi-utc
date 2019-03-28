package j2201827843.company;

import j2201827843.helper.Helper;
import j2201827843.storage.Data;

public class Company {

	private void AddNewSales() {
		Helper.in.nextLine();
		System.out.print("Sales Name : ");
		String name = Helper.in.nextLine();
		System.out.print("Address : ");
		String address = Helper.in.nextLine();
		System.out.print("Job Title : ");
		String title = Helper.in.nextLine();
		Data.addEmployee(new Sales(name, address, title, 0));
	}

	private void AddNewStaff() {
		Helper.in.nextLine();
		System.out.print("Staff Name : ");
		String name = Helper.in.nextLine();
		System.out.print("Address : ");
		String address = Helper.in.nextLine();
		System.out.print("Job Title : ");
		String title = Helper.in.nextLine();
		System.out.print("Sallary : ");
		int sallary = Helper.in.nextInt();
		Helper.in.nextLine();
		Data.addEmployee(new Staff(name, address, title, sallary));
	}

	private void AddNewEmployee() {
		int choice = 0;
		System.out.println("1. Add New Staff\n2. Add New Sales");
		choice = Helper.in.nextInt();
		switch (choice) {
		case 1:
			AddNewStaff();
			break;
		case 2:
			AddNewSales();
			break;
		}
	}

	private void AddNewProduct() {
		System.out.print("Product Name : ");
		String name = Helper.in.nextLine();
		System.out.print("Product Category : ");
		String category = Helper.in.nextLine();
		System.out.print("Price for Customer : ");
		int pfc = Helper.in.nextInt();
		Helper.in.nextLine();
		System.out.print("Price for Sales : ");
		int pfs = Helper.in.nextInt();
		Helper.in.nextLine();
		Data.addProduct(new Product(name, category, pfc, pfs));
	}

	private void Sell() {
		Data.showEmployees();
		System.out.print("Who sell ? : ");
		int idx = Helper.in.nextInt();
		Helper.in.nextLine();
		if (!(Data.employees.get(idx - 1) instanceof Sales)) {
			System.out.println("Sorry staff can't do such thing ! ");
			Helper.in.nextLine();
		} else {
			Sales sales = (Sales) Data.employees.get(idx - 1);
			sales.Sell();
		}
	}

	private void GetDetails() {
		Data.showEmployees();
		System.out.print("Choose an employee : ");
		int idx = Helper.in.nextInt();
		Helper.in.nextLine();
		if (Data.employees.get(idx - 1) instanceof Staff) {
			Staff staff = (Staff) Data.employees.get(idx - 1);
			System.out.printf("Name : %s\nAddress : %s\nJob Title : %s\n Sallary : %d\n", staff.getName(),
					staff.getAddress(), staff.getJobTitle(), staff.getSallary());
		} else if (Data.employees.get(idx - 1) instanceof Sales) {
			System.out.println("1. Simple View\n2. Detailed View");
			int choice = Helper.in.nextInt();
			Sales sales = (Sales) Data.employees.get(idx - 1);
			switch (choice) {
			case 1:
				System.out.printf("Name : %s\nAddress : %s\nJob Title : %s\n Sallary : %d\n", sales.getName(),
						sales.getAddress(), sales.getJobTitle(), sales.getSallary());
				break;
			case 2:
				System.out.printf("Name : %s\nAddress : %s\nJob Title : %s\n", sales.getName(), sales.getAddress(),
						sales.getJobTitle());
				System.out.println("Transaction Details : ");
				sales.PrintDetail();
			}
		}
	}

	private void menu() {
		int choice = 0;
		do {
			Helper.cls();
			System.out.println(
					"Welcome To Cosmetic Company !\n1. See Product Listing\n2. See Employee Listing\n3. Add New Product\n4. Add New Employee\n5. Sell Product(for sales only)\n6. Get Employee Details\n7. Exit");
			choice = Helper.in.nextInt();
			Helper.in.nextLine();
			switch (choice) {
			case 1:
				Data.showProducts();
				Helper.in.nextLine();
				break;
			case 2:
				Data.showEmployees();
				Helper.in.nextLine();
				break;
			case 3:
				AddNewProduct();
				break;
			case 4:
				AddNewEmployee();
				break;
			case 5:
				Sell();
				break;
			case 6:
				GetDetails();
				Helper.in.nextLine();
				Helper.in.nextLine();
				break;
			}
		} while (choice != 7);

	}

	public Company() {
		menu();
	}

	public static void main(String[] args) {
		new Company();
	}
}
