package programs;

public class GCD {

	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 20;
		int result = Math.min(num1, num2);
		while(result>0) {
			if(num1%result == 0 && num2%result ==0) {
				break;
			}
			result--;
		}
		System.out.println(result);
	}

}
