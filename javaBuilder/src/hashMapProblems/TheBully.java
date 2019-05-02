package hashMapProblems;

import java.util.HashMap;
import java.util.Map;

public class TheBully {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> mapBully1 = new HashMap<String, String>();
		mapBully1.put("a", "candy");
		mapBully1.put("b", "dirt");
		
		System.out.println("\n#################Before Modification################\n");
		
		System.out.println(mapBully1);
//		for (Map.Entry<String, String> entry : mapBully1.entrySet())
//			System.out.println("Key =" + entry.getKey() + " , Value = " + entry.getValue());
//		
		if(mapBully1.containsKey("a") && mapBully1.containsKey("b")) {
			mapBully1.replace("a", "candy", "");
			mapBully1.replace("b", "dirt", "candy");
		}
		
		System.out.println("***************************");
		System.out.println(mapBully1);
		
//		System.out.println("\n#################After Modification################\n");
//		for (Map.Entry<String, String> entry : mapBully1.entrySet())
//			System.out.println("Key =" + entry.getKey() + " , Value = " + entry.getValue());
//
//		
		//----------------------------------------------------------------------------------
		
		System.out.println("\n#################Problem 2 Before Modification################\n");
		HashMap<String, String> mapBully2 = new HashMap<String, String>();
		mapBully2.put("a", "candy");
	
		
		System.out.println("\n#################Before Modification################\n");
		System.out.println(mapBully2);
		
		if(mapBully2.containsKey("a")) {
			mapBully2.replace("a", "candy", "");
			mapBully2.put("b", "candy");
			
		}
		
		
		System.out.println("\n################# Problem 2 After Modification################\n");
		System.out.println(mapBully2);
		//----------------------------------------------------------------------------------
		
				System.out.println("\n#################Problem 3 Before Modification################\n");
				HashMap<String, String> mapBully3 = new HashMap<String, String>();
				mapBully3.put("a", "candy");
				mapBully3.put("b", "carrot");
				mapBully3.put("c", "meh");
			
				
				System.out.println("\n#################Before Modification################\n");
				
				System.out.println(mapBully3);
				if(mapBully3.containsKey("a")&& mapBully3.containsKey("b") ) {
					mapBully3.replace("a", "candy", "");
					mapBully3.replace("b", "carrot", "candy");
					
				}
				
				
				System.out.println("\n################# Problem 3 After Modification################\n");
				System.out.println(mapBully3);
	}

}
