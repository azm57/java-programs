package programs;

public class SumSquareDiff {

	public static void main(String[] args) {
		long sumsquare = 0;
		for(int i=0;i<=100;i++) {
			sumsquare+=i;
		}
		sumsquare = sumsquare*sumsquare;
		System.out.println(sumsquare);
		
		long squaresum = 0;
		for(int i=1;i<=100;i++) {
			squaresum+=i*i;
		}
		System.out.println(squaresum);
		System.out.println(sumsquare-squaresum);

	}

}
