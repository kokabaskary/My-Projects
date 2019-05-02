import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapAccess {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();

		//hashmap1
		hmap1.put(100, "ND");
		hmap1.put(1, "NY");
		hmap1.put(2, "NJ");
		hmap1.put(3, "CA");
		hmap1.put(3, "PA");
		hmap1.put(null, "MI");
		hmap1.put(4, null);
		hmap1.put(5, "ND");
		hmap1.put(200, "SD");

		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();

		//hashmap2
		hmap2.put(999, "PQ");
		hmap2.put(1000, "QR");
		System.out.println("\n***********************2nd Map ******************\n");
		
		//adding map to map
		hmap1.putAll(hmap2);
		
		System.out.println("\n***********************1st Map******************\n");
		System.out.println(hmap1.containsValue("MI"));
		System.out.println(hmap1.containsKey(null));
		System.out.println(hmap1.get(200));
		System.out.println(hmap1.replace(2, "XY"));
		System.out.println(hmap1.remove(2));
		System.out.println(hmap1.get(200).hashCode());
		
		
		

		System.out.println("\n***********************All entries******************\n");
		for (Map.Entry<Integer, String> entry : hmap1.entrySet())
			System.out.println("Key =" + entry.getKey() + " , Value = " + entry.getValue());
		
		System.out.println("\n####################LinkedHashMap##################3");
		LinkedHashMap<Integer, String> lmap1 =new LinkedHashMap<Integer, String>();

		//linked hashmap1 insertion order
		lmap1.put(100, "ND");
		lmap1.put(1, "NY");
		lmap1.put(2, "NJ");
		lmap1.put(3, "CA");
		lmap1.put(3, "PA");
		lmap1.put(null, "MI");
		lmap1.put(4, null);
		lmap1.put(5, "ND");
		lmap1.put(200, "SD");

		LinkedHashMap<Integer, String> lmap2 = new LinkedHashMap<Integer, String>();

		//hashmap2
		lmap2.put(999, "PQ");
		lmap2.put(1000, "QR");
		
		//adding linkmap to linkmap
		lmap1.putAll(lmap2);
		
		System.out.println(lmap1.putIfAbsent(200, "SD"));
		System.out.println(lmap1.putIfAbsent(201, "AB"));
		
		System.out.println("\n***********************1st LinkedHashMap******************\n");
		System.out.println(lmap1.containsValue("MI"));
		System.out.println(lmap1.containsKey(null));
		System.out.println(lmap1.get(200));
		System.out.println(lmap1.replace(2, "XY"));
		System.out.println(lmap1.remove(2));
		System.out.println(lmap1.get(200).hashCode());
		
		System.out.println("\n***********************2nd LinkedHashMap ******************\n");
		
		

		System.out.println("\n***********************All entries******************\n");
		for (Map.Entry<Integer, String> entry : lmap1.entrySet())
			System.out.println("Key =" + entry.getKey() + " , Value = " + entry.getValue());
		
		
		
		System.out.println("\n***********************Linked hashmap Access order******************\n");
		
		LinkedHashMap<Integer, String> lmap1Access =new LinkedHashMap<Integer, String>(16, .75f,true);//changing the constructor

		//linked hashmap1 Access order
		lmap1Access.put(100, "ND");
		lmap1Access.put(1, "NY");
		lmap1Access.put(2, "NJ");
		lmap1Access.put(3, "CA");
		lmap1Access.put(3, "PA");
		lmap1Access.put(null, "MI");
		lmap1Access.put(4, null);
		lmap1Access.put(5, "ND");
		lmap1Access.put(200, "SD");

		LinkedHashMap<Integer, String> lmap2Access = new LinkedHashMap<Integer, String>();

		//linkedhashmap2
		lmap2Access.put(999, "PQ");
		lmap2Access.put(1000, "QR");
		
		//adding linkmap to linkmap
		lmap1Access.putAll(lmap2Access);
		
		
		
		
		System.out.println(lmap1Access.putIfAbsent(200, "SD"));
		System.out.println(lmap1.putIfAbsent(201, "AB"));
		
		System.out.println("\n***********************1st LinkedHashMap******************\n");
		System.out.println(lmap1Access.containsValue("MI"));
		System.out.println(lmap1Access.containsKey(null));
		System.out.println(lmap1Access.get(200));
		System.out.println(lmap1Access.replace(2, "XY"));
		System.out.println(lmap1Access.remove(2));
		System.out.println(lmap1Access.get(200).hashCode());
		
		System.out.println("\n***********************2nd LinkedHashMap ******************\n");
		
		//Accessing elements
		lmap1Access.get(100);

		System.out.println("\n***********************All entries******************\n");
		for (Map.Entry<Integer, String> entry : lmap1Access.entrySet())
			System.out.println("Key =" + entry.getKey() + " , Value = " + entry.getValue());
		
		
		//############################TRee Map################################
		
		System.out.println("/n********************Tree Map********************8/n");
		
		TreeMap<Integer, String> tmap1 = new TreeMap<Integer, String>();

		//treemap1
		tmap1.put(100, "ND");
		tmap1.put(1, "NY");
		tmap1.put(2, "NJ");
		tmap1.put(3, "CA");
		tmap1.put(3, "PA");
//		tmap1.put(null, "MI");
		tmap1.put(4, null);
		tmap1.put(5, "ND");
		tmap1.put(200, "SD");

		TreeMap<Integer, String> tmap2 = new TreeMap<Integer, String>();

		//treemap2
		tmap2.put(999, "PQ");
		tmap2.put(1000, "QR");
		System.out.println("\n***********************2nd Map ******************\n");
		
		//adding map to map
		tmap1.putAll(tmap2);
		
		Map<Integer, String> newMap = new TreeMap<Integer, String>(Collections.reverseOrder());
		newMap.putAll(tmap1);
		
		
		System.out.println("\n***********************1st TreeMap******************\n");
		System.out.println(tmap1.containsValue("MI"));
//		System.out.println(tmap1.containsKey(null));
		System.out.println(tmap1.get(200));
		System.out.println(tmap1.replace(2, "XY"));
		System.out.println(tmap1.remove(2));
		System.out.println(tmap1.get(200).hashCode());
		
		
		

		System.out.println("\n***********************All entries******************\n");
		for (Map.Entry<Integer, String> entry : tmap1.entrySet())
			System.out.println("Key =" + entry.getKey() + " , Value = " + entry.getValue());
	}

}
