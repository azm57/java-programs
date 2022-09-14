package programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String name1 = "listen";
		String name2 = "silent";
		
		char[] charArr1 = name1.toCharArray();
		char[] charArr2 = name2.toCharArray();
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		boolean res = Arrays.equals(charArr1, charArr2);
		
		if(res)
			System.out.println("Yes");
		else
			System.out.println("No");
		

	}

}
