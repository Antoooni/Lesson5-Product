package by.htp.Product.domain;

public class Product {
	private int id;
	private String name;
	private long upc;
	private String producer;
	private double price;
	private int shelfLife;
	private int quantity;

	public Product(int id, String name, long upc, String producer, double price, int shelfLife, int quantity) {
		this.id = id;
		this.name = name;
		this.upc = upc;
		this.producer = producer;
		this.price = price;
		this.shelfLife = shelfLife;
		this.quantity = quantity;
	}

	public Product() {

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getUpc() {
		return upc;
	}

	public String getProducer() {
		return producer;
	}

	public double getPrice() {
		return price;
	}

	public int getShelfLife() {
		return shelfLife;
	}

	public int getQuantity() {
		return quantity;
	}

}
