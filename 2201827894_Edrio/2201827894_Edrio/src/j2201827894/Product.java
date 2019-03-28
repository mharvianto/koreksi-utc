package j2201827894;

import java.util.ArrayList;

public class Product {
	private String name;
	private Integer priceCustomer[] = { 3, 7, 11 };
	private Integer priceSalesman[] = { 1, 4, 7 };
	private int Category[] = { 1, 2, 3 };

	public void sell(Salesman a, int category, ArrayList<Transaction> tList) {
		a.setProfit(priceCustomer[category - 1] - priceSalesman[category - 1]);
		Transaction x = new Transaction();
		x.Seller = a.getName();
		x.Categories = category;
		tList.add(x);
	}

}
