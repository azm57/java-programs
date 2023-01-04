
public class NumPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 12321;
		int rev = 0;
		int num = num1;
		while(num > 0) {
			rev = rev * 10 + num%10;
			num = num/10;
		}
		if(rev == num1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
