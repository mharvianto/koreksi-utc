package j2201827982;

public class Employee {

	protected String name, address, title;
	protected int money;

	public Employee() {
		this.money = 0;
	}

	public Employee(String name, String address, String title) {
		super();
		this.name = name;
		this.address = address;
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void receiveSalary() {
		money += 300;
		System.out.println(this.name + " has receive the salary (money: " + this.money + ")");
	}

	public void sell() {
		money += 150;
		System.out.println(this.name + " sell a product (money: " + this.money + ")");
	}

	public void buy() {
		money -= 100;
		System.out.println(this.name + " buy a product from company (money: " + this.money + ")");
	}
}
