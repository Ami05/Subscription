package code;

import builders.IProduct;

public class Product implements IProduct {

	private String productName;
	private String productCategory;

	public String getProductName() {

		return productName;
	}

	public void setProductName(String productName) {

		this.productName = productName;
	}

	public String getProductCategory() {

		return productCategory;
	}

	public void setProductCategory(String productCategory) {

		this.productCategory = productCategory;
	}

	public String getBrand() {

		return productCategory;
	}

	public double subscriptionMode(Subscription subscription, int year, int month) {
		
		return new CalculateExpense().calculate(subscription,year,month,productCategory);
	}
}
