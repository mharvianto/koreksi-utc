package j2201827976;

public class Company {

	public Company() {
		Transaction t = new Transaction();
		Product p = new Product();
		Employee employee1 = new Salesman("Michael", "Jl. Padat Karya", "Salesman", 5000000 + t.getProfit());
		Employee employee2 = new Staff("Raphiel", "Jl. Sepi Karya", "Staff", 5000000);
		Product customer = new Product("Zaphkiel", "Cake", 15000, 5, p.getQty() * p.getCust_price());
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(customer.toString());

	}

	public static void main(String[] args) {
		new Company();

	}

}
