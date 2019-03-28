package j2201827793.helper;

import j2201827793.objects.Company;
import j2201827793.objects.Transaction;

public class Helper {

	public int totalPrice() {
		int total = 0;
		for (Transaction trans : Company.transactionList) {
			total += trans.getPrice();
		}
		return total;
	}

}
