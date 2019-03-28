package j2201828051;

public class Company {

	protected String name;
	private int totalSold = 0;

	public int getTotalSold() {
		return totalSold += 1;
	}

	public void setTotalSold(int totalSold) {
		this.totalSold = totalSold;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double calculateSalary() {
		return 0;
	}

	public Company() {

	}

	public Company(String name) {
		super();
		this.name = name;
	}

	public double totalProfit() {
		return 0;
	}

	public static void main(String[] args) {
		Employee staff = new Staff("Jalan Pancasan No. 3", "Ari");
		Employee salesman = new Salesman("Jalan Soemanta No. 1", "Budi");

		Product product = new Product("Lipsthick", "Make-Up", 50000, 20000);

		salesman.soldProduct();
		System.out.println();
		salesman.soldProduct();
		System.out.println();
		product.getBalance();

		System.out.println(staff.toString());
		System.out.println(staff.calculateSalary());
		System.out.println(salesman.toString());
		System.out.println(salesman.calculateSalary());
	}

}
