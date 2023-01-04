package programs;

import java.util.Scanner;

public class PalindromStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
		String name1 = sc.nextLine();
		
		char[] chrArr = name1.toCharArray();
		int len = chrArr.length;
		boolean res = true;
		for (int i = 0; i < len / 2; i++) {
			if (!(chrArr[i] == chrArr[len - i - 1])) {
				res = false;
				break;
			}
		}
		if (res)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}

}
