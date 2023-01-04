
public class StringRotationOfEachOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCD";
		String s2 = "CDAB";
		int l=s1.length();
		
		if(s1.length()!=s2.length()) {
			System.out.println("Exit");
		}else {
			String s3=s1+s1;
			if(s3.indexOf(s2)!=-1){
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}
