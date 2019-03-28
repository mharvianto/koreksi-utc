package j2201827692;

public class Staff extends Employee {

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String nama, String alamat, String pekerjaan, double gaji) {
		super(nama, alamat, pekerjaan, gaji);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void totalGaji(int indikator) {
		setGaji(getGaji() * indikator);
	}

	@Override
	public String toString() {
		return "Staff [getNama()=" + getNama() + ", getAlamat()=" + getAlamat() + ", getPekerjaan()=" + getPekerjaan()
				+ ", getGaji()=" + getGaji() + "]";
	}
}
