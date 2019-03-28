/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2201827780;

/**
 *
 * @author prk
 */
public class Staff extends Employee {

	public Staff(String nama, String alamat, String jenis, Integer base_salary) {
		super(nama, alamat, jenis, base_salary);
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = "Kuku";
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = "Malang";
	}

	public String getJenis() {
		return jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = "Staff";
	}

	public Integer getBase_salary() {
		return base_salary;
	}

	public void setBase_salary(Integer base_salary) {
		this.base_salary = 150000;
	}

}
