package programs;

public class SwapStr {

	public static void main(String[] args) {
		String str1 = "Azeem";
		String str2 = "Mohammad";

		str1 = str1 + str2;

		System.out.println("str2 " + str1.substring(0, str1.length() - str2.length()));
		System.out.println("str1 " + str1.substring(str1.length() - str2.length()));

	}

}
