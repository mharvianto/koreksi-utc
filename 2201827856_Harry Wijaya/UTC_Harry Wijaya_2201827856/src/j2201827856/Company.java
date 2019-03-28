package j2201827856;

import java.util.Vector;

public class Company {

	public static Vector<Employee> vEmployees = new Vector<>();
	public static Vector<Product> vProducts = new Vector<>();

	public Company() {
		System.out.println("Selamat datang di 123 BeautyShop");
		System.out.println("Kami memiliki beberapa pekerja ");
		for (Employee employee : vEmployees) {
			System.out.println("Nama 		: " + employee.getName());
			System.out.println("Alamat  	: " + employee.getAddress());
			System.out.println("Job Title 	: " + employee.getJobTitle());
			System.out.println("Salary		: " + employee.calculateSalary());
		}

		System.out.println("Kami menjual berbagai produk kecantikan seperti : ");
		for (Product product : vProducts) {
			System.out.println("Nama 		: " + product.getProductName());
			System.out.println("Category  	: " + product.getCategory());
			System.out.println("Harga	 	: " + product.getPrice());
		}

	}

	public static void main(String[] args) {
		Employee a = new Staff("Carmel", "Jalan Majapada 5");
		Employee b = new Salesman("Harry", "Jalan Tanjung Balai 9");
		vEmployees.add(a);
		vEmployees.add(b);

		Product aa = new Product("C Powder", "Bedak", 15000, 18000);
		Product ab = new Product("Casablanca", "Minyak wangi", 15000, 19000);
		Product ac = new Product("Lifegirl", "Shampoo", 15000, 20000);
		Product ad = new Product("Dave", "Sabun", 15000, 21000);
		Product ae = new Product("SoftBaby", "Masker", 15000, 22000);

		vProducts.add(aa);
		vProducts.add(ab);
		vProducts.add(ac);
		vProducts.add(ad);
		vProducts.add(ae);

		new Company();
	}
}
