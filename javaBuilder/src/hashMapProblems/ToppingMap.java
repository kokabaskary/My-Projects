package hashMapProblems;

import java.util.HashMap;

public class ToppingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(topping());
	}

	/*- Problem 04: Optional
	Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
	topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
	topping1({}) → {"bread": "butter"}
	topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}*/
	
	public static HashMap<String, String> topping() {
		HashMap<String, String> mTopping = new HashMap<String, String>();
		
//		mTopping.put("ice cream", " peanuts");
//		mTopping.put("pancake", "syrup");
		
		
		
		if(mTopping.containsKey("ice cream")) {
			mTopping.putIfAbsent("bread", " butter");
			mTopping.put("ice cream", " cherry");
		return mTopping;
		} else if (mTopping.containsKey("pancake")) {
			mTopping.putIfAbsent("bread ", " butter");
			
		}else  {
			mTopping.put("bread", "butter");
		}
	
		return mTopping;
		
	}

}
