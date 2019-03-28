package j2201827881;

//import java.util.Vector;

public class Salesman extends Employee {
	public Salesman(String name, String address, String jobTitle) {
		super(name, address, jobTitle);
		// TODO Auto-generated constructor stub
	}

	public void jual(Product p, int kuantitas) {
		new Transaction(p.getProductName(), p.getHargaModal(), p.getHargaJual(), kuantitas, this);

	}

//	public void jual(Vector<Product> p){
//		new Transaction(p)
//	}

}
