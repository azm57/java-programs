package programs;

public class nonzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {17,13,0,0,19,0,5,2,0,3,0,0,8,9};
		int len = a.length;		
		
		int[] tmp = new int[len];
		int j=0;

		for(int i=0;i<len;i++)
		{
			if(a[i]!=0)
			{
				tmp[j++]=a[i];
			}
			
		}

		int remIndex = len-j+2;

		for(j=remIndex;j<len;j++)
		{
			tmp[j]=0;
		}

		for(int k=0;k<tmp.length;k++)
		{
			System.out.println(tmp[k]);
		}


	}

}
