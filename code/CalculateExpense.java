package code;

import java.util.Calendar;
import java.util.HashMap;

import testData.NewsPaperDataGenerator;

public class CalculateExpense {
	
	private double getWeekdays(Double double1, int noOfWeekdays) {
		double weekdaysCost=0;
		for(int i=0;i<noOfWeekdays;i++){
			weekdaysCost = weekdaysCost + double1;
		}
		return weekdaysCost;
	}
	
	private double getSaturday(Double double1, int noOfSaturdays) {	
		double saturdayCost=0;
		for(int i=0;i<noOfSaturdays;i++){
			saturdayCost = saturdayCost + double1;
		}
		return saturdayCost;
	}

	
	private double getSunday(Double double1, int noOfSundays) {
		double sundayCost=0;
		for(int i=0;i<noOfSundays;i++){
			sundayCost = sundayCost + double1;
		}	
		return sundayCost;
	}

	public double calculate(Subscription subscription, int year, int month,String productCategory){
		double totalCost=0;
		int sat = Calendar.SATURDAY;
		int sun = Calendar.SUNDAY;
		int numberOfWeekDays=0;
		int numberOfSaturDays=0;
		int numberOfSunDays=0;
		
		 Calendar start = Calendar.getInstance();
	     start.set(year, month, 1);
	     
	     Calendar end = Calendar.getInstance();
	     end.set(year, month, start.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		if(subscription.getSubsciptionMode().equalsIgnoreCase("monthly")){
			
			
			while (start.before(end)) {
	            if (start.get(Calendar.DAY_OF_WEEK) != sat && start.get(Calendar.DAY_OF_WEEK) != sun ) {
	            	numberOfWeekDays++;
	              //  start.add(Calendar.DATE, 1);
	            }
	            else if(start.get(Calendar.DAY_OF_WEEK) == sat){
	            	numberOfSaturDays++;
	                //start.add(Calendar.DATE, 1);
	            }
	            
	            else if(start.get(Calendar.DAY_OF_WEEK) == sun){
	            	numberOfSunDays++;
	                
	            }
	            start.add(Calendar.DATE, 1);
	        }

			
			
			HashMap<String, HashMap<String, Double>> data = new NewsPaperDataGenerator().getSubscriptionDetail();
			String[] productBrand =  subscription.getBrandName().split(",");
			
			for(int i=0;i<productBrand.length;i++){
				if(data.containsKey(productBrand[i])){
					
					HashMap<String,Double> eachProductCost = data.get(productBrand[i]);
					totalCost = totalCost + getWeekdays(eachProductCost.get("weekdays"), numberOfWeekDays)+getSaturday(eachProductCost.get("saturday"), numberOfSaturDays)+getSunday(eachProductCost.get("sunday"), numberOfSunDays);
				}
			}
		}
			return totalCost;

	}

}
