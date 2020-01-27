package builders;

import code.Subscription;

public class SubscriptionBuilder {
	
	Subscription subsciption = new Subscription();
	
	public SubscriptionBuilder withSubsciptionMode(String subscriptionMode){
		
		subsciption.setSubsciptionMode(subscriptionMode);
		return this;
	}
	public SubscriptionBuilder withBrand(String brandName) {

		subsciption.setBrandName(brandName);
		return this;
	}

	public Subscription build(){
		return subsciption;
	}
}
