class Prime
{
	public static void main(String args[])
	{	int num=Integer.parseInt(args[0]);
		int count=0;
		double n=Math.sqrt(num);

		for(int i=2;i<=n;i++)
		{ 	if (num%i==0)
			{	 count=1;
				break;
			}
		}
		if (count==1)
		{	System.out.println("No");
		}
		else
		{	System.out.println("Prime");
		}
	}



}