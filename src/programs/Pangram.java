package programs;

import java.util.HashSet;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write your code here
	    int sum=0;
	    HashSet<Integer> hs =  new HashSet<>();
	    String isPangram = "";
	    String s = "We promptly judged antique ivory buckles for the next prize";
	    String sL = s.toLowerCase();
	    String noSpance = sL.replaceAll("\\s","");
	    char[] charArr = noSpance.toCharArray();
	   
	    for(char ch:charArr){
	        hs.add(Math.abs(ch - 'a'));
	    }
	    for(int i:hs) {sum+=i;}
	    if(sum==325){isPangram = "pangram";}
	    else {isPangram = "not pangram";}
	    System.out.println(isPangram);
	    }

}
