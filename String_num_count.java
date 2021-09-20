import java.util.Scanner;
import java.lang.String;
class String_num_count
{	public static void main(String args[])
	{	Scanner reader=new Scanner(System.in);
		String str=reader.nextLine();
		char[]  arr=str.toCharArray();
		int n=str.length();
		int[] count={0,0,0,0,0,0,0,0,0,0,0};
		
		 for(int i=0;i<n;i++)
		{	int char_value=(int) arr[i];
			if(char_value<58 && char_value>=48)
			{	count[char_value-48]+=1;
			}
			
		}
		for(int i =0;i<10;i++)
		{ 	System.out.println(count[i]);
		}
	}



}