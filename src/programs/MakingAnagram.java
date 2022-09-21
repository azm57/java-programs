package programs;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagram {

	public static int numberNeeded(String first, String second) {
		Map<Character, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < first.length(); i++) {
			if (map.get(first.charAt(i)) == null) {
				map.put(first.charAt(i), 1);
			} else {
				int cur = map.get(first.charAt(i));
				map.put(first.charAt(i), cur + 1);
			}
		}
		for (int i = 0; i < second.length(); i++) {
			if (map.containsKey(second.charAt(i))) {
				int cur = map.get(second.charAt(i));
				if (cur == 1) {
					map.remove(second.charAt(i));
				} else {
					map.put(second.charAt(i), cur - 1);
				}
			} else {
				count++;
			}
		}

		for (Integer i : map.values()) {
			count = count + i;
		}

		return count;
	}

	public static void main(String[] args) {

		String a = "abc";
		String b = "da";
		System.out.println(numberNeeded(a, b));
	}
}