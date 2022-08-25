package programs;

class LargestPriFact
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double num = 600851475143.0;
		int max = 0;
		int prime = 2;
		while(num >= prime){
		    if(num % prime == 0){
		        num /= prime;
		        if(max < prime){
		            max = prime;
		        }
		        prime = 2;
		    }
		    else{
		        prime++;
		    }
		}
		System.out.println(max);
	}
}
