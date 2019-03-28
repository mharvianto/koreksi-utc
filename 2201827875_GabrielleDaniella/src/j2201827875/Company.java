package j2201827875;

import java.util.*;

public class Company {
	static Vector<Employee> vEmployee = new Vector<>();
	static Vector<Product> vProduct = new Vector<>();

	public static void main(String[] args) {
		Employee andi = new Staff("Andi", "Jl. Taman Venes", "Staff");
		vEmployee.add(andi);
		// andi.showData();
		System.out.println();
		Product abc = new Product("Lipstick ABC", "Lipstick", 70000, 100000, 100);
		vProduct.add(abc);
		// abc.showData();
		System.out.println();
		Transaction x = new Transaction("Lipstick ABC", "Lipstick", 70000, 100000, 20);
		vProduct.add(x);
		// x.showData();
		System.out.println();
		Employee budi = new Salesman("Budi", "Jl. Taman Udayana", "Salesman");
		vEmployee.add(budi);
		// budi.showData();

	}

}
