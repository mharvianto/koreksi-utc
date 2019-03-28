package j2201827963;

public class Company {

	public static void main(String[] args) {
		Staff budi = new Staff("Budi", "Kebun Jeruk", "Staff", 3850000);
		Salesman andi = new Salesman("Andi", "Gunung Sahari", "Salesman");
		Transaction tr = new Transaction();

		System.out.println("Budi's Salary : " + budi.getSalary());
		tr.getTransaction();
		System.out.println("Andi's Salary : " + andi.calculateSalary());

	}

}
