import java.lang.String;
class String_compareToIgnoreCase
{	public static void main(String args[])
	{	String s=new String("HlO");
		String s1=new String("hLO");
		int result=s.compareToIgnoreCase(s1);
		System.out.println(result);
	}

}