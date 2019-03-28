package j2201827906;

public class Company {

	public Company() {
		Product baru = new Product("abc", "obat", 400, 300);
		Employee edgar = new Staff("Egar", "Jalan2", "Staff", 300);
		Employee x = new Salesman("edgar", "Jalan1", "Salesman", 300);
		Salesman.jualProduk(baru.getPriceCust(), baru.getPriceSale());
		Transaction.view(baru.getPriceCust());
		System.out.println(edgar.getSalary());
		System.out.println(x.getSalary());

	}

	public static void main(String[] args) {
		new Company();

	}

}
