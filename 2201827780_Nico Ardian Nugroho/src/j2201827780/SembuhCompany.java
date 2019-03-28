/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2201827780;

import java.util.Scanner;

/**
 *
 * @author prk
 */
public class SembuhCompany {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws Exception {
		int pilih = 0;
		Scanner input = new Scanner(System.in);
		Transaksi trs = new Transaksi();
		String user;
		String pwd;
		try {
			do {
				System.out.println("");
				System.out.println("");
				System.out.println("----LOGIN----");
				System.out.print("Username: ");
				user = input.nextLine();
				System.out.print("Password: ");
				pwd = input.nextLine();
				System.out.println("-------------");
				System.out.println("");
				System.out.println("");
				if (user.equals("Sales") && pwd.equals("Sales")) {
					do {
						user = "Sales";
						System.out.println("Account Sales");
						System.out.println("-------------");
						System.out.println("1. Sell Product");
						System.out.println("2. View Salary");
						System.out.println("3. Exit");
						System.out.print(">> ");
						pilih = input.nextInt();
						input.nextLine();
						switch (pilih) {
						case 1:
							trs.sell();
							break;
						case 2:
							trs.viewSalarySales(user);
							break;
						default:
							break;
						}
					} while (pilih != 2);

				} else if (user.equals("Staff") && pwd.equals("Staff")) {
					do {
						user = "Staff";
						System.out.println("Account Staff");
						System.out.println("-------------");
						System.out.println("1. View Salary");
						System.out.println("2. Exit");
						pilih = input.nextInt();
						input.nextLine();
						switch (pilih) {
						case 1:
							trs.viewSalaryStaff(user);
							break;
						default:
							break;
						}
					} while (pilih != 1);
				} else {
					System.out.println("---------------");
					System.out.println("Account Salah!!");
					System.out.println("---------------");
				}
			} while (true);
		} catch (Exception e) {
			System.out.println("Input Salah!");
		}
		// TODO code application logic here
	}

}
