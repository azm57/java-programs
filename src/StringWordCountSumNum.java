import java.util.HashMap;
import java.util.Map;

public class StringWordCountSumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am Shyam and I have 2 mangos, 3 Oranges and 4 Guavas. I sell 1 mangos, 1 Organge and 3 Guavas. How many mangoes I have now";
		int numCount=0;

		Map<String, Integer> dupHm = new HashMap<>();

		//duplicate words
		String[] strArr = str.split("\\s+");

		for(int i=0;i<strArr.length;i++)
		{
			if(!isNumeric(strArr[i]))
			{
				if(!dupHm.containsKey(strArr[i]))
				{
					dupHm.put(strArr[i], 1);
				}
				else
				{
					dupHm.put(strArr[i], dupHm.get(strArr[i])+1);
				}
			}		

		}

		dupHm.forEach((key, value) -> System.out.println(key + ":" + value));


		for(int j=0;j<strArr.length;j++)
		{
			if(isNumeric(strArr[j]))
			{
				numCount=numCount + Integer.parseInt(strArr[j]);
			}
		}
		System.out.println(numCount);

	}

	public static boolean isNumeric(String str) { 
		try {  
			Double.parseDouble(str);  
			return true;
		} catch(NumberFormatException e){  
			return false;  
		}  
	}

}
