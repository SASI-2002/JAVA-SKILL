import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Average_marks_Buffer
{
	public static void main(String args[]) throws IOException
	{          BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	           System.out.println("Enter name");
	           String name=reader.readLine();
	           System.out.println("Enter the marks of three subjects");
	           float m1=Float.parseFloat(reader.readLine());
	           float m2=Float.parseFloat(reader.readLine());
	           float m3=Float.parseFloat(reader.readLine());
	           float avg;
	           avg=(m1+m2+m3)/3;
	           System.out.println(avg);
	}

}