package code;

import java.util.Calendar;

import builders.ProductBuilder;
import builders.SetFrequency;
import builders.SubscriptionBuilder;

public class SubscriptionExpenseCalculator {

	public static void main(String[] args) {

		String newpaperList = "TOI,Hindu";
		Product product = new ProductBuilder().fromCategory("Books & Periodical category").withProduct("NewsPaper")
				.build();

		Subscription subsciption = new SubscriptionBuilder().withBrand(newpaperList)
				.withSubsciptionMode(SetFrequency.MONTHLY.toString()).build();

		double costOfTotalSubscription = product.subscriptionMode(subsciption, 2020, Calendar.FEBRUARY);
		System.out.println("The total cost of Subscription for "+newpaperList+" is : Rs" + costOfTotalSubscription);

	}

}
