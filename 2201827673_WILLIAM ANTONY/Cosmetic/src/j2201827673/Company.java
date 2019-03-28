package j2201827673;

import java.util.ArrayList;

public class Company {

	private ArrayList<Product> listProduct;

	public Company() {
		listProduct = new ArrayList<>();
	}

	public ArrayList<Product> getListProduct() {
		return listProduct;
	}

	public static void main(String args[]) {
		Company Toko = new Company();

		Product masker = new Product("Masker", "Wajah", 300000, 280000);
		Toko.getListProduct().add(masker);
		Product bedak = new Product("Bedak", "Badan", 50000, 45000);
		Toko.getListProduct().add(bedak);
		Product pensilAlis = new Product("Pensil Alis", "Pensil Alis", 10000, 8000);
		Toko.getListProduct().add(pensilAlis);

		Employee william = new Salesman("William", "Jl. Sudirman");
		((Salesman) william).sell(Toko.getListProduct().get(0));
		((Salesman) william).sell(Toko.getListProduct().get(1));
		((Salesman) william).sell(Toko.getListProduct().get(0));
		((Salesman) william).sell(Toko.getListProduct().get(2));
		((Salesman) william).showPriceToCust();

		System.out.println();
		System.out.println();

		william.calculateSalary();

		System.out.println();
		System.out.println();

		Employee antony = new Staff("Antony", "Jl. Riau");
		antony.calculateSalary();

		System.out.println();
		System.out.println();

		Employee andi = new Salesman("Andi", "Jl. Pakuan");
		((Salesman) andi).sell(Toko.getListProduct().get(0));
		((Salesman) andi).sell(Toko.getListProduct().get(2));
		((Salesman) andi).showPriceToCust();

		System.out.println();
		System.out.println();

		andi.calculateSalary();

	}

}
