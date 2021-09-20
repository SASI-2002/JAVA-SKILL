class Search_num
{	public static void main(String[] args)
	{	int search=Integer.parseInt(args[0]);
		int[] arr=new int[10];
		int flag=0;
		for (int i=1;i<11;i++)
		{	arr[i-1]=Integer.parseInt(args[1]);
			if(arr[i-1]==search)
			{	System.out.println(i-1);
				flag=1;	
			}
			else
			{	continue;

			}	
		}
		if (flag!=1)
		{	System.out.println(-1);

		}
	}

}