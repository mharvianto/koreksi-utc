package j2201827925;

import j2201827925.Product;

public class Salesman extends Employee {

	int sold;

	public Integer getProfit(int custPrice, int salesPrice) {
		return custPrice - salesPrice;
	}

	int profit = getProfit(100000, 80000) * sold;

	public Salesman() {
		// TODO Auto-generated constructor stub
	}

	public Salesman(String nama, String address, int sold) {
		this.nama = nama;
		this.address = address;
		this.title = "Salesman";
		this.sold = sold;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString(String nama, String address, String title) {
		return "Employee\nnama = " + nama + "\naddress = " + address + "\ntitle = " + title + "\nsalary = Rp"
				+ getProfit(100000, 80000) * sold;
	}

}
