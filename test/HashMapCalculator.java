import java.util.HashMap;

public class HashMapCalculator {
	public int commonKeyValuePairs(HashMap<String, String> one, HashMap<String, String> two) {
		int matches = 0;
		System.out.println("hi");
		
		for(String o : one.keySet()) {
			for(String t : two.keySet()) {
				if(o.equals(t)) {
					if(one.get(o).equals(two.get(t))) {
						matches++;
					}
				}
			}
		}
		
		return matches;
	}
}
