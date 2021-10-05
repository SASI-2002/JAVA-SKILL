class Demo1{
   void disp(int a, double b){
	System.out.println("Method A");
   }
   void disp(double a, double b){
	System.out.println("Method B");
   }

   public static void main(String args[]){
	Demo1 obj=new Demo1();
	obj.disp(100.0, 20);
	obj.disp(100, 20);
	obj.disp(100, 20.0);
   }
}