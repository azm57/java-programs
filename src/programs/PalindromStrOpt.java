package programs;

public class PalindromStrOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "madaam";
		int k=0;
		int l=(str1.length()/2)-1;
		for(int i=0;i<=l;i++) {
			if(str1.charAt(i)==str1.charAt(str1.length()-i-1)) {
				k++;
			}
		}
		if(k==l+1) {System.out.println("Yes");}
		else {System.out.println("No");}

	}

}
