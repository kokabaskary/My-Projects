import java.util.HashMap;
import java.util.Map;

public class MyMap {

	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		
		m1.put(1, "Mango");
		m1.put(2, "Orange");
		m1.put(3, "Orange");
		m1.put(3, "Banana");
		m1.put(3, "Banana");
		
		System.out.println(m1.keySet());
		System.out.println(m1.values());

	}

}
