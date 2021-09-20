import java.util.Scanner;
import java.lang.String;
class String_toLowerCase
{


	public static void main(String args[])
	{	Scanner reader=new Scanner(System.in);
		String str=reader.nextLine();
		String str1="Lowercase"+" "+str.toLowerCase();
		 String str2="Uppercase"+" "+str.toUpperCase();
		System.out.println(str1+str2);


	}

}