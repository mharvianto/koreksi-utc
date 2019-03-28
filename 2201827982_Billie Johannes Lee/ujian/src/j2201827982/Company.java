package j2201827982;

import java.util.*;;

public class Company {

	ArrayList<Staff> staffList = new ArrayList<Staff>();
	ArrayList<Salesman> salesmanList = new ArrayList<Salesman>();

	public ArrayList<Staff> getStaffList() {
		return staffList;
	}

	public ArrayList<Salesman> getSalesmanList() {
		return salesmanList;
	}

	public static void main(String[] args) {
		Company company = new Company();

		Staff rudi = new Staff("Rudi", "Perumahan Indah Blok G9/25");
		company.getStaffList().add(rudi);
		rudi.receiveSalary();
		System.out.println();

		Salesman heru = new Salesman("Heru", "Taman Indah Raya Blok I1/12");
		company.getSalesmanList().add(heru);
		System.out.println();

		Transaction t = new Transaction();
		heru.buy();
		heru.buy();
		heru.buy();
		heru.sell();
		heru.sell();

	}
}
