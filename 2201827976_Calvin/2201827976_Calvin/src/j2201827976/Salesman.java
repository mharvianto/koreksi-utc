package j2201827976;

public class Salesman extends Employee {
	static Transaction t = new Transaction();

	@Override
	public String toString() {
		return "Salesman [name=" + name + ", address=" + address + ", job_title=" + job_title + ", salary=" + salary
				+ "]";
	}

	public Salesman(String name, String address, String job_title, int salary) {
		super("Michael", "Jl. Padat Karya", "Salesman", 5000000 + t.getProfit());
	}

}
