package programs;

public class StrBeautifulBinary {

	public static void main(String[] args) {

		String input = "0101010";
		int n = input.length();
		int answer = 0;
		int i = 0;
		while (i < n - 2) {
			if (input.substring(i, i + 3).equals("010")) {
				answer++;
				i += 3	;
				continue;
			}
			i++;
		}
		System.out.println(answer);

	}
}