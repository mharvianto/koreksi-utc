package j2201827995.main;

import j2201827995.database.Company;
import j2201827995.model.Employee;
import j2201827995.model.Salesman;
import j2201827995.model.Staff;
import j2201827995.model.Transaction;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		Transaction tr = new Transaction(Company.prodList.get(0), 2);
		Company.transList.add(tr);
		Transaction trr = new Transaction(Company.prodList.get(1), 3);
		Company.transList.add(trr);

		System.out.println("Total price for customer : "
				+ Company.prodList.get(0).getPriceCust() * Company.transList.get(0).getQuantity());

		for (Employee em : Company.empList) {
			if (em instanceof Staff) {
				System.out.println("Staff");
				System.out.println("--------------------");
				System.out.println("Name : " + em.getName());
				System.out.printf("Salary : Rp. %d ,-", em.getSalary());
				System.out.println("\nAddress : " + em.getAddress());
				System.out.println();
			} else if (em instanceof Salesman) {
				System.out.println("Salesman");
				System.out.println("--------------------");
				System.out.println("Name : " + em.getName());
				System.out.println("Address : " + em.getAddress());
				System.out.printf("Total Profit : Rp. %d ,-", em.getSalary());
			}
		}
	}
}
