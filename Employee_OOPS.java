class Employee_OOPS
{	int id;
	String name;
	int salary;
	void setid(int i)
	{	id=i;
	}
	void setname( String n)
	{	name=n;

	}
	void setsalary(int s)
	{	salary=s;
	}
	void getdetails()
	{	System.out.println(name+"slary is"+salary);
	}
	public static void main(String args[])
	{	Employee_OOPS emp=new Employee_OOPS();
		emp.setid(22);
		emp.setname("n");
		emp.setsalary(40004009);
		emp.getdetails();
	}
	
}