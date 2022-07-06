import java.util.*;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		
		Map <Integer,String> m = new Hashtable<Integer,String>();
		
		m.put(10, "A");
		m.put(20, "B");
		m.put(30, "C");
		m.put(50, "D");
		m.put(30, "E");
		
		System.out.println(m);
		
		System.out.println("============");
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry);
		}
		
		for (Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry.getValue());
		}
		
		for (Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry.getKey());
		}
		
		/*Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(m);
		System.out.println(entrySet);
		
		for (Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry);
		}*/
	}
}
