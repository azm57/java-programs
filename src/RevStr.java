
public class RevStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "I am a java guy";
		int lastIdx=input.length()-1;
		char[] chrArr = input.toCharArray();
		for(int i=0;i<input.length();i++)
		{
			if(chrArr[i]==' ')
			{
				System.out.print(" ");
			}
			else if(chrArr[lastIdx]==' ')
			{
				lastIdx--;
				System.out.print(chrArr[lastIdx--]);
			}
			else
				System.out.print(chrArr[lastIdx--]);
		}
	}

}