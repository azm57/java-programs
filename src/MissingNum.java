
public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,6,5,4,9,7};
		int sizeOfNatNums = 10;
		int sum = 0;
		
		int expSum  = (sizeOfNatNums * (sizeOfNatNums-1))/2;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		int missingNum = expSum-sum;
		System.out.println("Missing Num is "+missingNum);

	}

}
