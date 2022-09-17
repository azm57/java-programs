package programs;

public class WordsInStr {
	
	public static void main(String[] args) {
		int OUT = 0;
		int IN = 1;
		int state=OUT;
		String str = " We ";
		int wordcount=0;
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == ' ' || charArr[i] == '\t' || charArr[i] == '\n') {
				state=OUT;
			}
			else if(state==OUT){
				state=IN;
				wordcount++;
			}
			
		}
		System.out.println(wordcount);
	}

}
