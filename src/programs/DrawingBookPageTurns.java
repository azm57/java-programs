package programs;

public class DrawingBookPageTurns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int p = 3;
		int frontD = p / 2;
		int backD = n % 2 == 0 ? (n - p + 1 / 2) + 1 : n - p / 2;
		System.out.println(Math.min(frontD, backD));

	}

}
