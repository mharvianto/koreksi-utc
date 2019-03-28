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
public class Product {

	private String namaProduct;
	private Integer harga;

	public Product() {

	}

	public Product(String namaProduct, Integer harga) {
		this.namaProduct = namaProduct;
		this.harga = harga;
	}

	public String getNamaProduct() {
		return namaProduct;
	}

	public void setNamaProduct(String namaProduct) {
		this.namaProduct = namaProduct;
	}

	public Integer getHarga() {
		return harga;
	}

	public void setHarga(Integer harga) {
		this.harga = harga;
	}

}
