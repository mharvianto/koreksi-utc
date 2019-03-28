package j2201827692;

public class Transaction {
	private String kodeTransaksi;
	private String namaCustomer;
	private int totalItem;
	private double totalHarga;
	private Product daftarProduk;
	private Employee daftarSalesman;

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(String kodeTransaksi, String namaCustomer, int totalItem, double totalHarga,
			Product daftarProduk, Employee daftarSalesman) {
		super();
		this.kodeTransaksi = kodeTransaksi;
		this.namaCustomer = namaCustomer;
		this.totalItem = totalItem;
		this.totalHarga = totalHarga;
		this.daftarProduk = daftarProduk;
		this.daftarSalesman = daftarSalesman;
	}

	public String getKodeTransaksi() {
		return kodeTransaksi;
	}

	public void setKodeTransaksi(String kodeTransaksi) {
		this.kodeTransaksi = kodeTransaksi;
	}

	public String getNamaCustomer() {
		return namaCustomer;
	}

	public void setNamaCustomer(String namaCustomer) {
		this.namaCustomer = namaCustomer;
	}

	public double getTotalHarga() {
		return totalHarga;
	}

	public void setTotalHarga(double totalHarga) {
		this.totalHarga = totalHarga;
	}

	public Product getDaftarProduk() {
		return daftarProduk;
	}

	public void setDaftarProduk(Product daftarProduk) {
		this.daftarProduk = daftarProduk;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public Employee getDaftarSalesman() {
		return daftarSalesman;
	}

	public void setDaftarSalesman(Employee daftarSalesman) {
		this.daftarSalesman = daftarSalesman;
	}

}
