package j2201827736;

import java.util.Vector;

public class Salesman extends Employee {

	protected Vector<Transaction> transaksi = new Vector<Transaction>();
	protected Vector<Product> produk = new Vector<Product>();
	protected Integer hargaSold = 0;
	protected Integer hargaPayable = 0;

	public Salesman() {
		// TODO Auto-generated constructor stub
	}

	public Salesman(String name, String address) {
		super(name, address, "Salesman");
		// TODO Auto-generated constructor stub
	}

	public void sold(String pname, Integer qty) {
		int i = 0;
		for (Product product : produk) {
			if (product.getNama().equals(pname)) {
				// using constructor
				Transaction temp = new Transaction(this.name, produk.get(i), qty, product.getHarga_customer());
				transaksi.add(temp);
			}
			i++;
		}
	}

	public void sold(Vector<Product> prod, Vector<Integer> qty) {
		Transaction temp = new Transaction(this.name, prod, qty);
		transaksi.add(temp);
	}

	public Vector<Transaction> getTransaksi() {
		return transaksi;
	}

	public void addProduct(String nama, Integer harga_cust, Integer harga_sales, String category) {
		Product temp = new Product(nama, category, harga_sales, harga_cust);
		produk.add(temp);
	}

	@Override
	public Integer getSalary() {
		int i = 0;
		Integer base_salary = super.getSalary();
		for (Transaction trx : transaksi) {
			for (Product prod : trx.getProduct()) {
				this.hargaSold += prod.getHarga_customer() * trx.getQty(i);
				this.hargaPayable += prod.getHarga_sales() * trx.getQty(i);
			}
		}
		return base_salary + this.hargaSold - this.hargaPayable;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Salesman";
	}

}
