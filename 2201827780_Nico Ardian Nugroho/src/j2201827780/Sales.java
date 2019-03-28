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
public class Sales extends Employee {

	private Integer profit;
	private Integer totalTransaksi;

	public Sales(Integer totalTraknsaksi, Integer profit, String nama, String alamat, String jenis,
			Integer base_salary) {
		super(nama, alamat, jenis, base_salary);
		this.profit = profit;
		this.totalTransaksi = totalTransaksi;
	}

	public Integer getTotalTransaksi() {
		return totalTransaksi;
	}

	public void setTotalTransaksi(Integer totalTransaksi) {
		this.totalTransaksi = totalTransaksi;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(Integer profit) {
		this.profit = profit;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = "Nico";
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = "Blitar";
	}

	public String getJenis() {
		return jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = "Sales";
	}

	@Override
	public Integer getBase_salary() {
		return base_salary;
	}

	@Override
	public void setBase_salary(Integer base_salary) {
		base_salary = 100000;
	}

}
