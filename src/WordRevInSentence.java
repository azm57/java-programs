
public class WordRevInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is Programming";
		
		String[] strAtrr = str.split("\\s");
		
		for(int i=0;i<strAtrr.length;i++) {
			String tmp = strAtrr[i];
			for(int j=tmp.length()-1;j>=0;j--) {
				System.out.print(tmp.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
