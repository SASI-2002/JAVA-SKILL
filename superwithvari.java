class A
{
	int val=0;
}

class B extends A
{
	int val=0;
	void set(int val)
	{
		val=val+10;
		this.val=val+10;
		super.val=val*2;
		System.out.println("arg Val is:"+val + "B val is:"+this.val + "A val is:"+super.val);
	}
	
}
class c2
{
	public static void main(String args[])
	{
		
		B obj=new B();
		obj.set(20);
	}

}