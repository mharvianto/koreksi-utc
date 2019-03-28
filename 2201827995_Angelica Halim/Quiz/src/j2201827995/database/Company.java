package j2201827995.database;

import java.util.ArrayList;

import j2201827995.model.*;

public class Company {

	public static ArrayList<Employee> empList = new ArrayList<>();
	public static ArrayList<Product> prodList = new ArrayList<>();
	public static ArrayList<Transaction> transList = new ArrayList<>();

	static {
		empList.add(new Staff("Andika", "Jalan Merapi no. 3", "Staff"));
		empList.add(new Salesman("Lesman", "Jalan Krakatau no. 5", "Salesman"));

		prodList.add(new Product("Keyboard", "Computer", 500000, 450000));
		prodList.add(new Product("Mouse", "Computer", 300000, 200000));
	}

}
