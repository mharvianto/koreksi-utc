package j2201827881;

//import java.util.Vector;

public class Transaction {
	private int untung;

	public Transaction(String productName, int hargaModal, int hargaJual, int kuantitas, Salesman a) {
		untung = hargaJual - hargaModal;

		System.out.printf("STRUK PENJUALAN\nNama Produk: %s\nKuantitas: %d\nHarga Satuan: %d\nHarga Total: %d\n",
				productName, kuantitas, hargaJual, hargaJual * kuantitas);
		System.out.println();
		System.out.println(productName + " terjual sebanyak " + kuantitas + " oleh " + a.getName());
		System.out.println("Untung dari hasil penjualan sebanyak IDR" + (untung * kuantitas));
		System.out.println();
		a.setGaji(untung * kuantitas);
	}

//	public Transaction(Vector<Product> p) {
//		for (Product po : p) {
//			
//		}
//untung = po.getHargaJual()-po.getHargaModal();
//		
//		System.out.printf("\nNama Produk: %s\nKuantitas: %d\nHarga Satuan: %d\nHarga Total: %d\n", p.getProductName(), kuantitas, hargaJual, hargaJual*kuantitas);
//		System.out.println();
//		System.out.println(productName+" terjual sebanyak "+kuantitas+" oleh "+a.getName());
//		System.out.println("Untung dari hasil penjualan sebanyak IDR"+(untung*kuantitas));
//		System.out.println();
//		a.setGaji(untung*kuantitas);
//	}

}
