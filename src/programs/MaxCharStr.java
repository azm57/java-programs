package programs;

public class MaxCharStr {
	static final int ASCII_SIZE = 256;
	static char result;

	public static void main(String[] args) {
		String str = "Azeeemmmmmmmmm";
		System.out.println(str);
		System.out.println("  -->> "+getMaxOccuringCharStr(str));

	}

	private static char getMaxOccuringCharStr(String str) {
		int count[] = new int[ASCII_SIZE];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		int max = -1;
		for (int j = 0; j < str.length(); j++) {
			if (max < count[str.charAt(j)]) {
				max = count[str.charAt(j)];
				result = str.charAt(j);
			}
		}
		return result;
	}

}
