package j2201827774;

import java.util.Scanner;
import java.util.Vector;

public class Staff extends Employee {
	@Override
	public double getTotalGaji() {
		// TODO Auto-generated method stub
		return super.getTotalGaji();
	}

	@Override
	public void setTotalGaji(double totalGaji) {
		// TODO Auto-generated method stub
		super.setTotalGaji(totalGaji);
	}

	@Override
	public Employee employeMenu(Scanner sc, Vector<Employee> listEmploye) {
		// TODO Auto-generated method stub
		sc.nextLine();
		String namaTemp;
		System.out.println("Login\nmasukkan nama");
		namaTemp = sc.nextLine();
		for (Employee a : listEmploye) {
			if (a.getNama().equalsIgnoreCase(namaTemp)) {
				System.out.println("Total gaji :" + a.getTotalGaji());
			}
		}
		sc.nextLine();
		Employee a = new Employee();
		return a;
	}
}
