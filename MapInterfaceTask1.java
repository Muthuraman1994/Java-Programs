import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaceTask1 {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(101, "Ram");
		m.put(102, "Raj");
		m.put(103, "Rak");
		m.put(104, "Raj");
		m.put(105, "Rao");
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
		boolean remove = m.remove(104, "Raj");
		System.out.println(remove);
		
		m.remove(104);
		System.out.println(m);
		System.out.println("==========");
		
		boolean containsKey = m.containsKey(105);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("Raj");
		System.out.println(containsKey);
		
		String string = m.get(103);
		System.out.println(string);
		
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
		
		for (Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry);
		}
		
		
		}
	
}
