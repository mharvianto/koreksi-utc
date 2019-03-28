package j2201827704;

public class Transaction {
	private String name = "";
	private String date = "";
	private int salary = 0;

	private String customerName = "";
	private int customerPrice = 0;
	private int quantity = 0;
	private int total = 0;

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(String name, String date, int salary) {
		super();
		this.name = name;
		this.date = date;
		this.salary = salary;
	}

	public Transaction(int price, String name, int quantity, String date) {
		this.customerName = name;
		this.date = date;
		this.customerPrice = price;
		this.quantity = quantity;
		this.total = quantity * this.customerPrice;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Transaction \nThe company has paid to \n[name=" + name + ", date=" + date + ", salary=" + salary + "]";
	}

	public void viewTransCust() {
		System.out.println("Transaction [customerName=" + customerName + ", customerPrice=" + customerPrice
				+ ", quantity=" + quantity + ", total=" + total + "]");
	}

}
