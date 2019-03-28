package j2201827824;

public class Salesman extends Employee {

	private int gajiSales;
	private int profit;
	private String jabatannya = "Salesman";
	private Product dukduk;

	public Salesman(String name, String address) {
		super(name, address);
		super.jobTitle = this.jabatannya;
		this.gajiSales = gajiSales;
		this.profit = profit;
		// TODO Auto-generated constructor stub
	}

	public int getGajiSales() {
		return dukduk.getDuitSales();
	}

	@Override
	public String toString() {
		return String.format("Nama : %s\nAlamat : %s\nJabatan : %s\nGaji : ", name, address, jabatannya);
	}

//	@Override
//	public int hitungGaji() {
//	
//	}

}
