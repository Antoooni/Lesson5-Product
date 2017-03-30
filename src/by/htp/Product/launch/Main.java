package by.htp.Product.launch;

import by.htp.Product.domain.Initialization;
import by.htp.Product.domain.Product;
import by.htp.Product.domain.ProductSearch;
import by.htp.Product.domain.Storage;

public class Main {
	

	public static void main(String[] args) {
		final int maxExpirationDays= 180;
		final double maxPrice=3.0;
		final String nameOfChosenProduct="Beer";
		
		Product productsArray[] = new Product[10];
		Initialization i =new Initialization();
		i.initializationGoods(productsArray);
		
		Storage p=new Storage(productsArray);
		p.showStorage(productsArray);
		
		ProductSearch search =new ProductSearch(productsArray);
		search.findProductByShelfLife(productsArray, maxExpirationDays);			
		search.findProductByName(productsArray, nameOfChosenProduct);
		search.findProductByNameAndPrice(productsArray, nameOfChosenProduct, maxPrice);

	}

}
