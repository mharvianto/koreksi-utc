package j2201827881;

public class Staff extends Employee {
	private int jamKerja;

	public Staff(String name, String address, String jobTitle) {
		super(name, address, jobTitle);
		this.jamKerja = 0;
		// TODO Auto-generated constructor stub
	}

	public void setJamKerja(int jamKerja) {
		this.jamKerja += jamKerja;
		System.out.println(name + " telah bekerja sebanyak " + jamKerja + " jam.");
	}

	@Override
	public void setGaji(int gaji) {
		int hitungan = gaji * jamKerja;
		super.setGaji(hitungan);
	}

}
