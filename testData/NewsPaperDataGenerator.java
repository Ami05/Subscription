package testData;

import java.util.HashMap;

public class NewsPaperDataGenerator {
	
	public HashMap<String,HashMap<String,Double>> getSubscriptionDetail(){
		
		HashMap<String,HashMap<String,Double>> newspaper = new HashMap<String,HashMap<String,Double>>();
		
		newspaper.put("TOI", addDailyCost(3.0,5.0,7.0));
		newspaper.put("Hindu", addDailyCost(2.5,4.0,4.0));
		newspaper.put("ET", addDailyCost(2.0,2.0,10.0));
		newspaper.put("BM", addDailyCost(1.5,1.5,1.5));
		newspaper.put("Hindu", addDailyCost(2.0,4.0,4.0));
		
		return newspaper;
	}
	
	private HashMap<String,Double> addDailyCost(double weekdays,double saturday,double sunday){
		
		HashMap<String,Double> dailyCost = new HashMap<String,Double>();
		dailyCost.put("weekdays",weekdays);
		dailyCost.put("saturday",saturday);
		dailyCost.put("sunday",sunday);
		
		return dailyCost;
		
	}

}
