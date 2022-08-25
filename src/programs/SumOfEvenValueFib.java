package programs;

public class SumOfEvenValueFib {

	public static void main(String[] args) {
		double i = 0;
		double j = 1;
		double k = 0;
		double count = 4000000;
		double sum=0;
		for (double x = 0; x < count; x++) {
			k = i + j;
			if(k%2==0)sum=sum+k;
			if(k>4000000)break;
			i = j;
			j = k;
		}
		System.out.println(sum);

	}

}
