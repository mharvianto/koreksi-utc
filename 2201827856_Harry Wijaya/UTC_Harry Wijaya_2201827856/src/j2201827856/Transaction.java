package j2201827856;

public class Transaction extends Product {

	public Transaction(String productName, String category, int price, int salesmanPrice) {
		super(productName, category, price, salesmanPrice);
		// TODO Auto-generated constructor stub
	}

	public void Beli(String productName, String category, int price) {
		System.out.println("Anda membeli barang : " + productName + " seharga Rp " + price + ",00");

	}

	public void Jual() {

	}

	public void showTotalPrice() {
		System.out.println("Total belanja anda : ");
	}

}
