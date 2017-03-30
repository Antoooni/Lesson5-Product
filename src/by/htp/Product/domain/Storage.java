package by.htp.Product.domain;

public class Storage {
	public Storage(Product[] productsArray) {
		// TODO Auto-generated constructor stub
	}

	Initialization i = new Initialization();

	public void showStorage(Product[] productsArray) {
		if (productsArray != null) {
			System.out.println("Whole your stock:");
			int curSize = i.curSize(productsArray);
			for (int j = 0; j < curSize; j++) {
				System.out.println("Product: " + productsArray[j].getName()+'\t' + " id: " + productsArray[j].getId()
						+ " upc: " + productsArray[j].getUpc() + " by " + productsArray[j].getProducer()+'\t' + " by price: "
						+ productsArray[j].getPrice() + "BYN shelf life: " + productsArray[j].getShelfLife() + " days "
						+ " out of stock: " + productsArray[j].getQuantity() + " pieces");
			}
			System.out.println();
		}
	}

}
