import java.util.Scanner;
import java.lang.String;
class String_All_Alphabets
{	public static void main(String args[])
	{	Scanner 	reader=new Scanner(System.in);
		String str=reader.nextLine();
		int charValue=1;
		int flag=0;
		while (charValue<27)
		{	char Alphabet=(char)(charValue+96);
			char Cap_Alphabet=(char)(charValue+64);
			if(str.indexOf(Alphabet)!=-1 || str.indexOf(Cap_Alphabet)!=-1)
			{	charValue=charValue+1;
				
			}
			else
			{	flag=1;
				break;
			}
		
		}
		if(flag==0)
		{	System.out.println("ALL APHABETS ARE FOUND");
		
		}
		else
		{	System.out.println(" ALL ALPHABETS ARE NOT FOUND");
		}
	}


}