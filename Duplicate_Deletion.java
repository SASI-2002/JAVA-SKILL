class Duplicate_Deletion
{	public static void main(String args[])
	{	int[] arr=new int[]{11,13,14,16,17,12,12};
		int flag=0;
		int del=0;
		
		for(int i=0;i<arr.length-del;i++)
		{	int search=arr[i];
			flag=0;
			for(int j=i;j>-1;j--)
			{	if (search==arr[j])
				{	flag=1;
					del=del+1;
					break;
				}
			}
			if(flag==1)
			{	for(int j=i;j<arr.length-del;j++)
				{	arr[j]=arr[j+1];
				}
				i=i-1;
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{	System.out.println(arr[i]);
		}
	}


}