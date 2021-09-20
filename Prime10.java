class Prime
{
	public static void main(String args[])
	{	for (int num=11;num<=99;num=num+2)
		{	
			int n=(int)Math.sqrt(num);
			
			int i=0;
			for(i=3;i<=n;i++)
			{ 	if (num%i==0)
				{	 
					break;
				}
			}
			if (i==n+1)
			{ 	System.out.println("Prime"+num);		
			}
			
		}
	}



} 