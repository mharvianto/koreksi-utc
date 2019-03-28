package j2201827824;

public class Staff extends Employee {
	private int gajiStaff = 1500000;// gajitetap
	private String jabatan = "Staff";

	public Staff() {

	}

	public Staff(String name, String address) {
		super(name, address);
		super.jobTitle = this.jabatan;
		super.gaji = this.gajiStaff;
	}

	public String getJabatan() {
		return jabatan;
	}

	public int getGajiStaff() {
		return gajiStaff;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Nama : %s\nAlamat : %s\nJabatan : %s\nGaji : %d\n", name, address, jabatan,
				getGajiStaff());
	}

}
