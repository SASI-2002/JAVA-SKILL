import java.util.Scanner;
import java.lang.String;
class Palindrome_String
{	public static void main(String args[])
	{	Scanner reader=new Scanner(System.in);
		String str=reader.nextLine();
		int flag=0;
		int i=0;
		int length=str.length();
		while(flag==0 && i<length/2)
		{	if(str.charAt(i)==str.charAt(length-i-1))
			{	i=i+1;
			}
			else
			{	flag=1;
			}	
		}
		if(flag==0)
		{	System.out.println("Palindrome");
		}
		else
		{               System.out.println("Not Palindrome");
		}
	}
}