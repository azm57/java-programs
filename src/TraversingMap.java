import java.util.HashMap;
import java.util.Map;

public class TraversingMap {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<>();
		hm.put("Azeem", "IN");
		hm.put("John", "AU");
		hm.put("Cummin", "US");
		
		for(Map.Entry<String, String> e : hm.entrySet()) {
			System.out.println("key :: "+e.getKey()+", value :: "+e.getValue());
			
		}
	}

}
