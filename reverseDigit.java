class ReverseDigit
{	public static void main(String args[])
	{	int n=Integer.parseInt(args[0]);
		int reverse=0;
		int i=1;
		while(n!=0)
		{	int remainder=n%10;
			reverse=reverse*10+remainder;
			n=n/10;
					
		}
		System.out.println(reverse);
	}

}