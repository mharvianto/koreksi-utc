package j2201827654;

import java.util.Scanner;

public class Helper {

	public static Scanner in = new Scanner(System.in);

	public static int inputAnggka() {
		int angka = 0;
		try {
			angka = in.nextInt();
		} catch (Exception e) {
			System.out.println("Masukan angkaaa");
			angka = -1;
		}
		in.nextLine();
		return angka;
	}

}
