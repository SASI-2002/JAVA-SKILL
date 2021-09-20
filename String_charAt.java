import java.util.Scanner;
import java.lang.String;
class String_charAt
{


	public static void main(String args[])
	{	Scanner reader=new Scanner(System.in);
		String str=reader.nextLine();
		int count=0;
		
		for(int i=0; i<str.length();i++)
		{		int val=(int)str.charAt(i);
				System.out.println(val);
				
				if (val>=48 && val<=58)
				{	count=count+1;
				}
		}
		System.out.println(count);
	}

}