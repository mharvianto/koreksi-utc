package j2201827843.company;

import java.util.ArrayList;

import j2201827843.helper.Helper;
import j2201827843.storage.Data;

public class Transaction {
	ArrayList<Product> products = new ArrayList<>();

	public void AddProduct(Product product) {
		products.add(product);
	}

	public void Sales() {
		int repeat;
		do {
			Helper.cls();
			System.out.println("Choose product to sell");
			Data.showProducts();
			int idx = Helper.in.nextInt();
			products.add(Data.products.get(idx - 1));
			Helper.in.nextLine();
			System.out.println("do you want to add another product ? 1 : YES | 2 : NO");
			repeat = Helper.in.nextInt();
		} while (repeat == 1);
	}

	public Transaction() {
		Sales();
	}

	public Integer PrintDetails() {
		int i = 1;
		int profit = 0;
		for (Product product : products) {
			System.out.printf("    %d | %-10s profit : %d\n", i++, product.getName(), product.CalculateProfit());
			profit += product.CalculateProfit();
		}
		System.out.println("Total profit : " + profit);
		return profit;
	}

	public Integer getProfit() {
		int profit = 0;
		for (Product product : products) {
			profit += product.CalculateProfit();
		}
		return profit;
	}
}
