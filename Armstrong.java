class Armstrong 
{
	public static void main(String[] args) 
	{
		int n=372;
		int temp=n;
	     int sum=0;
		 while(n!=0)
		{
			 int rem=n%10;
			 sum=sum+(rem*rem*rem);
			 n=n/10;
		}
			 if(temp==sum)

		System.out.println("armstrong");
		else
			System.out.println("not");
	}
}
