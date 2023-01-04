
public class SignletonPatternEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		System.out.println(x.hashCode());	
		System.out.println(y.hashCode());
		System.out.println(z.hashCode());
		

	}

}
