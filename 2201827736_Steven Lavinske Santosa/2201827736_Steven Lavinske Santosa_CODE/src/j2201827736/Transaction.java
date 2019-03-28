package j2201827736;

import java.util.Random;
import java.util.Vector;

public class Transaction {

	Random rand = new Random();

	private String sales;
	private String trxID;
	protected Vector<Product> vSold = new Vector<Product>();
	protected Vector<Integer> qty = new Vector<Integer>();
	private Integer total_harga = 0;

	public Transaction(String sales, Product produk, Integer qtys, Integer harga) {
		this.sales = sales;
		this.vSold.add(produk);
		this.qty.add(qtys);
		this.total_harga += harga;
		String x = "";
		for (int i = 0; i < 7; i++)
			x += rand.nextInt(10);
		this.trxID = "TRX" + x + "BNS";
	}

	public Transaction(String name, Vector<Product> prod, Vector<Integer> qty) {

	}

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public String getSales() {
		return sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}

	public String getTrxID() {
		return trxID;
	}

	public void addQty(Integer a) {
		this.qty.add(a);
	}

	public void addProduct(Product a) {
		this.vSold.add(a);
	}

	public Integer getQty(Integer index) {
		return this.qty.get(index);
	}

	public Vector<Product> getProduct() {
		return vSold;
	}

	public Integer getTotal_harga() {
		return total_harga;
	}

}
