
public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			if(i==3) continue;
			System.out.print(i);
		}
		System.out.println();
		for(int j=0;j<10;j++)
		{
			if(j==3) break;
			System.out.print(j);
		}
	}
}