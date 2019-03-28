package j2201827755;

import java.util.Vector;

public class Company {
	private Vector<Employee> listEmployee = new Vector<>();

	public Vector<Employee> getListEmployee() {
		return listEmployee;
	}

	public static void main(String[] args) {
		Company etude = new Company();

		Salesman jovan = new Salesman();
		jovan.setName("Jovan");
		jovan.setAddress("Jl. Anggur no 12");

		Employee rosa = new Staff();
		rosa.setName("Rosa");
		rosa.setAddress("Jl. Jeruk no 3");
		rosa.viewSalary();

		System.out.println();

		Product mascara = new Product();
		mascara.setName("Mascara");
		mascara.setCategory("Eye");
		mascara.setPriceForCust(120000);
		mascara.setPriceForSales(100000);

		Product eyeLiner = new Product();
		eyeLiner.setName("Eye Liner");
		eyeLiner.setName("Eye");
		eyeLiner.setPriceForCust(70000);
		eyeLiner.setPriceForSales(55000);

		Product lipstick = new Product();
		lipstick.setName("Lip Stick");
		lipstick.setCategory("lip");
		lipstick.setPriceForCust(100000);
		lipstick.setPriceForSales(85000);

		Cust lela = new Cust();
		lela.setName("Lela");
		jovan.saleProduct(eyeLiner, lela);

		Transaction t = new Transaction();
		t = jovan.saleProduct(mascara, lela);

		Transaction t1 = new Transaction();
		t1 = jovan.saleProduct(lipstick, lela);

		int total = 0;
		for (int i = 0; i < lela.getTransactionList().size(); i++) {
			total += lela.getTransactionList().get(i).view();
		}
		System.out.println("Total Price is Rp" + total);

		System.out.println();
		jovan.viewSalary();

	}
}
