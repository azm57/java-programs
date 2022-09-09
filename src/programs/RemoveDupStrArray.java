package programs;

import java.util.LinkedHashSet;

public class RemoveDupStrArray {

	public static void main(String[] args) {
		String str = "Azeem";
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
			lhs.add(str.charAt(i));
		for(char ch: lhs)
			System.out.print(ch);

	}

}
