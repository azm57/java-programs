package programs;

public class ReverseWordsArr {

	public static void main(String[] args) {
		String str = "This is World Wide Web";

		String[] strArr = str.split(" ");
		for (String chr : strArr) {
			System.out.print(chr);
			System.out.print(" ");
		}
		
		System.out.println();
		
		for (int i = 0; i < strArr.length; i++) {
			char[] tmpArr = strArr[i].toCharArray();
			for (int j = tmpArr.length - 1; j >= 0; j--) {
				System.out.print(tmpArr[j]);
			}
			System.out.print(" ");
		}

	}

}
