package j2201827692;

public class Salesman extends Employee {

	public Salesman() {
		// TODO Auto-generated constructor stub
	}

	public Salesman(String nama, String alamat, String pekerjaan, double gaji) {
		super(nama, alamat, pekerjaan, gaji);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void totalGaji(int indikator) {
		setGaji(getGaji() * indikator);
	}

	@Override
	public String toString() {
		return "Salesman [getNama()=" + getNama() + ", getAlamat()=" + getAlamat() + ", getPekerjaan()="
				+ getPekerjaan() + ", getGaji()=" + getGaji() + "]";
	}

}
