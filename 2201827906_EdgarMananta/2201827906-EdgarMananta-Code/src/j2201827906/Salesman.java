package j2201827906;

public class Salesman extends Employee {

	public Salesman(String name, String address, String jobTitle, int salary) {
		super(name, address, jobTitle, salary);
		// TODO Auto-generated constructor stub
	}

	private static Integer profit = 0;

	@Override
	public void setSalary(Integer salary) {
		// TODO Auto-generated method stub
		super.setSalary(salary);
	}

	@Override
	public Integer getSalary() {
		// TODO Auto-generated method stub
		return salary + profit;
	}

	public static void jualProduk(int priceCust, int priceSale) {
		profit += (priceCust - priceSale);
	}

}
