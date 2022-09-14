package programs;

import java.util.Scanner;

public class VowelFreq {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter your statement");
		String str = scr.nextLine();

		int a = 0, e = 0, i = 0, o = 0, u = 0;
		char[] chrArr = str.toCharArray();
		System.out.println(chrArr.length);
		for(int ii=0;ii<chrArr.length;ii++)
		{
			char ch = chrArr[ii];
			if(ch=='a') a++;
			else if (ch=='e') e++;
			else if (ch=='i') i++;
			else if (ch=='o') o++;
			else if (ch=='u') u++;
			
		}
		System.out.println(a+" "+e+" "+i+" "+o+" "+u);

	}

}
