package j2201827950;

import java.util.ArrayList;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Salesman irfan = new Salesman("Irfan", "Jalan Merdeka", "Salesman", 3000000);
		Products lipstik = new Products("Lipstick", "Make Up", 100000, 80000);
		Products bedak = new Products("Bedak", "Make Up", 150000, 120000);
		Products lotion = new Products("Lotion", "Skin Care", 200000, 160000);
		Staff Bambang = new Staff("Bambang", "Jalan Kemanggisan", "Staff", 5000000);
		Salesman Yanto = new Salesman("Yanto", "Jalan jalan", "Salesman", 3000000);
		Vector<Transaction> vTran = new Vector<>();

		System.out.println(irfan);
		System.out.println("");
		irfan.sellProduct(lotion, 3);
		System.out.println("Profit " + irfan.getName() + " : " + irfan.getProfit());
		System.out.println("Salary " + irfan.getName() + " : " + irfan.calculateSalary());
		Transaction temp = new Transaction(lotion.getCustPrice(), 3);
		vTran.add(temp);
		System.out.println("Tagihan Customer : " + vTran.get(vTran.size() - 1).getPrice());
		System.out.println("");
		System.out.println("Gaji Bambang : " + Bambang.calculateSalary());
		System.out.println("");
		irfan.sellProduct(lipstik, 5);
		System.out.println("Profit " + irfan.getName() + " : " + irfan.getProfit());
		System.out.println("Salary " + irfan.getName() + " : " + irfan.calculateSalary());
		temp.setPrice(lipstik.getCustPrice());
		temp.setSum(5);
		vTran.add(temp);
		System.out.println("Tagihan Customer : " + vTran.get(vTran.size() - 1).getPrice());
		System.out.println(Yanto);
		Yanto.sellProduct(lotion, 3);
		System.out.println("Profit " + Yanto.getName() + " : " + Yanto.getProfit());
		System.out.println("Salary " + Yanto.getName() + " : " + Yanto.calculateSalary());
		temp.setPrice(lotion.getCustPrice());
		temp.setSum(3);
		vTran.add(temp);
		System.out.println("Tagihan Customer : " + vTran.get(vTran.size() - 1).getPrice());
		System.out.println("");
	}
}
