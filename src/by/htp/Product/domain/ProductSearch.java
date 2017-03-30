package by.htp.Product.domain;

public class ProductSearch {
	public ProductSearch(Product[] productsArray) {

	}

	Initialization i = new Initialization();

	public Product[] findProductByName(Product[] productsArray, String stringnameProducts) {
		System.out.println("Products which have name: " + stringnameProducts + "");
		if (productsArray != null) {
			String[] names = stringnameProducts.split(",");
			int curSize = i.curSize(productsArray);
			for (int i = 0; i < curSize; i++) {
				String productsName = productsArray[i].getName();
				for (String h : names) {
					if (h.contains(productsName)) {
						System.out.println("Product: " + productsArray[i].getName() + '\t' + " id: "
								+ productsArray[i].getId() + " upc: " + productsArray[i].getUpc() + " by "
								+ productsArray[i].getProducer() + '\t' + " by price: " + productsArray[i].getPrice()
								+ "BYN shelf life: " + productsArray[i].getShelfLife() + " days " + " out of stock: "
								+ productsArray[i].getQuantity() + " pieces");
					}
				}
			}
			System.out.println();
		}
		return productsArray;
	}

	public Product[] findProductByNameAndPrice(Product[] productsArray, String nameOfChosenProduct, double maxPrice) {
		System.out.println(
				"Products which have name " + nameOfChosenProduct + " and max price less than " + maxPrice + " BYN: ");
		if (productsArray != null) {
			String[] names = nameOfChosenProduct.split(",");
			int curSize = i.curSize(productsArray);
			for (int i = 0; i < curSize; i++) {
				String productsName = productsArray[i].getName();
				double maxProductPrice = productsArray[i].getPrice();
				for (String h : names) {
					if (h.contains(productsName) && maxProductPrice <= maxPrice) {
						System.out.println("Product: " + productsArray[i].getName() + '\t' + " id: "
								+ productsArray[i].getId() + " upc: " + productsArray[i].getUpc() + " by "
								+ productsArray[i].getProducer() + '\t' + " by price: " + productsArray[i].getPrice()
								+ "BYN shelf life: " + productsArray[i].getShelfLife() + " days " + " out of stock: "
								+ productsArray[i].getQuantity() + " pieces");
					}
				}
			}
			System.out.println();
		}
		return productsArray;
	}

	public Product[] findProductByShelfLife(Product[] productsArray, int maxDays) {

		System.out.println("Products life cycle more or equals " + maxDays + " days: ");
		if (productsArray != null) {
			int curSize = i.curSize(productsArray);
			for (int i = 0; i < curSize; i++) {
				int lifeCycle = productsArray[i].getShelfLife();
				if (lifeCycle >= maxDays) {
					System.out.println("Product: " + productsArray[i].getName() + '\t' + " id: "
							+ productsArray[i].getId() + " upc: " + productsArray[i].getUpc() + " by "
							+ productsArray[i].getProducer() + '\t' + " by price: " + productsArray[i].getPrice()
							+ "BYN shelf life: " + productsArray[i].getShelfLife() + " days " + " out of stock: "
							+ productsArray[i].getQuantity() + " pieces");
				}
			}
			System.out.println();
		}
		return productsArray;
	}

}
