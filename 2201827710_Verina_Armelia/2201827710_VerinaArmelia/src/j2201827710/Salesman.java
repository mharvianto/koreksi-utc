package j2201827710;

public class Salesman extends Employee {

	public Salesman(String name, String adress) {
		super(name, adress, "Salesman", 0);

	}

	public Salesman() {
	}

	@Override
	public String toString() {
		return String.format("Salesman's Stat\n========\nName :%s\nJob:%s\nAdress:%s\nProfit:%d\n", name, jobTitle,
				adress, salary);
	}
}
