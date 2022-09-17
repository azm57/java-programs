package programs;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		for(int k=0;k<arr.length;k++)
			System.out.print(arr[k]+" ");
		
		System.out.println();
		
		int revArr[] = new int[arr.length]; 
		int j=0;
		for (int i = arr.length - 1; i >= 0; i--) {
			revArr[j++] = arr[i];
		}
		for(int k=0;k<revArr.length;k++)
			System.out.print(revArr[k]+" ");
	}

}
