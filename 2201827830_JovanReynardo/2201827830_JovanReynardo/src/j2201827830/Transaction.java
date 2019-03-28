package j2201827830;

public class Transaction {

	private static long totalPriceForCustomer;

	public Transaction() {
		totalPriceForCustomer = 0;
	}

	public static void printTransaction(Salesman salesman) {
		System.out.println("Transaksi Customer " + salesman.getName());
		System.out.println("===================================");
		totalPriceForCustomer = 0;
		int i = 1;
		for (Product product : salesman.getProductList()) {
			System.out.println("No." + i++);
			System.out.println("Nama Produk : " + product.getName());
			System.out.println("Category Produk : " + product.getCategory());
			System.out.println("Harga : " + product.getPriceForCustomer());
			totalPriceForCustomer += product.getPriceForCustomer();
		}

		System.out.println("Total harga yang harus dibayar customer : " + totalPriceForCustomer);
	}

}
