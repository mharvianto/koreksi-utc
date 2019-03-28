package j2201827654;

public class Transaction extends Product {

//	private String namaProduk;
//	private String hargaProduk;
	private int total;

	public Transaction(String namaProduk, int hargaProduk, int total) {
		super(namaProduk, hargaProduk);
		this.total = total;
	}

	public Transaction() {

	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
