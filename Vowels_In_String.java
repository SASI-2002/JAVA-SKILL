import java.util.Scanner
import java.lang.String
class Vowels_In_String
{	public static void main(String args[])
	{	Scanner reader=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=reader.nextLine();
		vowels_sum=str.count('a')+str.count('e')+str.count('i')+str.count('o')+str.count('u');
		System.println(vowels_sum);
	}


}