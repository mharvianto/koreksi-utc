package j2201827963;

public class Transaction {

	Product lifeboy = new Product("LifeBoy", "Soap", 35000, 50000, 3);
	Product pantene = new Product("Pantene", "Shampoo", 30000, 45000, 5);

	public void getTransaction() {
		int totalPrice = lifeboy.quantity * lifeboy.priceCostumer;
		System.out.println("Total Price : " + totalPrice);

		totalPrice = pantene.quantity * pantene.priceCostumer;
		System.out.println("Total Price : " + totalPrice);
	}

	public int getTotalQuantity() {
		return lifeboy.quantity + pantene.quantity;
	}
}
