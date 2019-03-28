package j2201827995.model;

import j2201827995.database.Company;

public class Salesman extends Employee {

	public Salesman(String name, String address, String job) {
		super(name, address, job);
	}

	@Override
	public int getSalary() {
		Transaction tr = new Transaction(Company.prodList.get(0), 2);
		Company.transList.add(tr);
		Transaction trr = new Transaction(Company.prodList.get(1), 3);
		Company.transList.add(trr);

		return (Company.prodList.get(0).getPriceCust() * Company.transList.get(0).getQuantity())
				- (Company.prodList.get(0).getPriceSales() * Company.transList.get(0).getQuantity());
	}
}
