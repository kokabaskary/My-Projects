package hashMapProblems;

import java.util.HashMap;

public class MappingAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(mapAB());
	}

	/*
	 * Problem 03: Modify and return the given map as follows: for this problem the
	 * map may or may not contain the "a" and "b" keys. If both keys are present,
	 * append their 2 string values together and store the result under the key
	 * "ab". mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b":
	 * "There"} mapAB({"a": "Hi"}) → {"a": "Hi"} mapAB({"b": "There"}) → {"b":
	 * "There"}
	 */

	public static HashMap<String, String> mapAB() {
		HashMap<String, String> mAB = new HashMap<String, String>();
		
		mAB.put("a", "Hi");
		mAB.put("b", "There");
		
		if(mAB.containsKey("a")&& mAB.containsKey("b")) {
			mAB.putIfAbsent("ab", " Hi"+" There");
		
		return mAB;
		}else if(mAB.containsKey("a")|| mAB.containsKey("b"))
			
			
		return mAB;
		return mAB;
		
	}

}
