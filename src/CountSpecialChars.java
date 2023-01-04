
public class CountSpecialChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hell^&*(o Worl@d";
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			if(!Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);

	}

}
