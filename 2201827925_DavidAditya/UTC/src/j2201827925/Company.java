package j2201827925;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee st1 = new Staff("David", "Surabaya");
		Employee sm1 = new Salesman("Aditya", "Jogjakarta", 50);

		System.out.println(st1.toString());
		System.out.println("");
		System.out.println(sm1.toString());
		System.out.println("");

		Trans tr1 = new Trans("Mirror", 25000, 5);
		System.out.println(tr1.toString());
		System.out.println("");

		Trans tr2 = new Trans("Hair Pin", 2000, 500);
		System.out.println(tr2.toString());
		System.out.println("");

	}

	public Company() {
		new Company();
	}

}
