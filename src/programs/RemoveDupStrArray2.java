package programs;

public class RemoveDupStrArray2 {

	public static void main(String[] args) {
		String str = "Azeem";
		String tmp = "" + str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (!tmp.contains(String.valueOf(str.charAt(i))))
				tmp = tmp + str.charAt(i);
		}
		System.out.println(tmp);
	}
}
