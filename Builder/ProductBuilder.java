package builders;

import code.Product;

public class ProductBuilder {
	
	 Product product = new Product();
	
	public ProductBuilder withProduct(String productName){
		product.setProductName(productName);
		return this;
	}
	
	public ProductBuilder fromCategory(String productCategory){
		product.setProductCategory(productCategory);
		return this;
	}
	
	public Product build(){
		return product;
	}

}
