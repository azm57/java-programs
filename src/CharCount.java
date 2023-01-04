import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Better butter";
		Map<Character, Integer> hm = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}else {
				hm.put(str.charAt(i), 1);
			}
		}
		
		Map.Entry<Character, Integer> maxEntry = null;
		for(Map.Entry<Character, Integer> entry: hm.entrySet()) {
			if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue())>0){
				maxEntry = entry;
			}
		}
		System.out.println(maxEntry);
		
		for(Map.Entry<Character, Integer> e: hm.entrySet()) {
			if(e.getValue()>1)
			{
				System.out.println("Key :"+e.getKey());
				System.out.println("Value :"+e.getValue());
				
			}
		}

	}

}
