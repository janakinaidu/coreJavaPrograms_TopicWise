import java.io.Serializable;
import java.util.Comparator;

public class Products implements Serializable {

	/**
	 * @author janakinaidu
	 */
	private static final long serialVersionUID = 1L;

	private int productId;
	private String productName;
	private double price;
	private String providername;

	public Products() {
		System.out.println("calling Products");
	}

	public Products(int productId, String productName, double price, String providername) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.providername = providername;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProvidername() {
		return providername;
	}

	public void setProvidername(String providername) {
		this.providername = providername;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Products) {
			return ((Products) obj).productId == productId;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.productId;
	}

	@Override
	public String toString() {
		return "[productId=" + productId + ", productName=" + productName + ", price=" + price + ", providername="
				+ providername + "]";
	}
	
	//Logic fopr price sortnig
	public static Comparator<Products> priceComparator = new Comparator<Products>() {

		@Override
		public int compare(Products p1, Products p2) {
			if (p1.getPrice() > p2.getPrice()) {
				return 1;
			} else if (p1.getPrice() < p2.getPrice()) {
				return -1;
			} else {
				return 0;
			}
		}

	};

}
