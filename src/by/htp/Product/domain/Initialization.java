package by.htp.Product.domain;

public class Initialization {

	private String name;
	private int upc;
	private String producer;
	private double price;
	private int shelfLife;
	private int quantity;
	private int id;

	public Product[] initializationGoods(Product productsArray[]) {
		if (productsArray != null) {
			// Id, name, UPC, producer, price, shelf life, quantity
			productsArray[0] = new Product(1, "Tomato", 1234567890, "Bonduelle", 3.5, 10, 100);
			productsArray[1] = new Product(2, "Juice", 1334567890, "7up   ", 2.0, 365, 50);
			productsArray[2] = new Product(3, "Beer", 1434567890, "Carlsberg", 2.5, 180, 20);
			productsArray[3] = new Product(4, "Beer", 1534567890, "Hostein", 1.5, 180, 25);
			productsArray[4] = new Product(5, "Beer", 1634567890, "Hoegaarden", 5.5, 90, 10);
		}
		return productsArray;
	}

	int curSize(Product productsArray[]) { // default visibility
		int size = 0;
		for (Product e : productsArray) {
			if (e != null) {
				size = size + 1;
			}
		}
		return size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUpc() {
		return upc;
	}

	public void setUpc(int upc) {
		this.upc = upc;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
