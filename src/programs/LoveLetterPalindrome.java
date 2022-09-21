package programs;

public class LoveLetterPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write your code here
		String s = "abcde";
		int iIndexToStartFrom;
		int iNumOfReduction = 0;
		char[] charArr = s.toCharArray();
		int len = charArr.length;
		if (charArr.length % 2 == 0) {
			iIndexToStartFrom = len / 2;
		} else
			iIndexToStartFrom = len / 2 + 1;

		for (int i = iIndexToStartFrom; i < s.length(); i++) {
			iNumOfReduction += Math.abs(charArr[len - i - 1] - charArr[i]);
		}
		System.out.println(iNumOfReduction);

	}

}
