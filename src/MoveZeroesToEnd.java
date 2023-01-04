
public class MoveZeroesToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {0,0,0,2,1,0,2,5};
		int counter=0;
		int len = intArr.length;
		
		for(int i=0;i<len;i++) {
			if(!(intArr[i]==0)) {
				intArr[counter++]=intArr[i];
			}
		}
		while(counter<len)
		{
			intArr[counter++]=0;
		}
		
		for(int j:intArr) {System.out.print(j+" ");}

	}

}
