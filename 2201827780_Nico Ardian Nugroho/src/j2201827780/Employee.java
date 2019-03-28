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
public class Employee {

	protected String nama;
	protected String alamat;
	protected String jenis;
	protected Integer base_salary;

	public Employee(String nama, String alamat, String jenis, Integer base_salary) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.jenis = jenis;
		this.base_salary = base_salary;
	}

	public Employee() {
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getJenis() {
		return jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	public Integer getBase_salary() {
		return base_salary;
	}

	public void setBase_salary(Integer base_salary) {
		this.base_salary = base_salary;
	}

}
