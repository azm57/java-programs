package programs;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ClicksDomain {
	public static Map<String, Integer> calculateClicksByDomainMap = new ConcurrentHashMap<>();

	public static void main(String[] argv) {

		String[] counts = { "900,google.com", "60,mail.yahoo.com", "10,mobile.sports.yahoo.com", "40,sports.yahoo.com",
				"300,yahoo.com", "10,stackoverflow.com", "20,overflow.com", "5,com.com", "2,en.wikipedia.org",
				"1,m.wikipedia.org", "1,mobile.sports", "1,google.co.uk" };
		doSolve(counts);

	}

	public static void doSolve(String[] counts) {
		for (final String count : counts) {
			String[] separateClickCountsAtComma = count.split("\\,");
			for (int j = 0; j < separateClickCountsAtComma.length; j += 2) {
				Integer clickCount = Integer.parseInt(separateClickCountsAtComma[j]);
				String domain = separateClickCountsAtComma[j + 1];
				calculateClicksByDomainMap.put(domain, clickCount);
				splitStringOnOccurenceOfDot(domain.substring(domain.indexOf(".") + 1), clickCount,
						calculateClicksByDomainMap);
			}
		}
		calculateClicksByDomainMap.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " " + entry.getValue());
		});
	}

	public static void splitStringOnOccurenceOfDot(String domainName, Integer domainCount,
			Map<String, Integer> calculateClicksByDomainMap) {
		if (calculateClicksByDomainMap.containsKey(domainName)) {

			Integer newCount = calculateClicksByDomainMap.get(domainName) + domainCount;
			calculateClicksByDomainMap.put(domainName, newCount);
		} else {
			calculateClicksByDomainMap.put(domainName, domainCount);
		}
		if (domainName.contains(".")) {
			splitStringOnOccurenceOfDot(domainName.substring(domainName.indexOf(".") + 1), domainCount,
					calculateClicksByDomainMap);
		}
	}
}