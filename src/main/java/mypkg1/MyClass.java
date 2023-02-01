package mypkg1;

public class MyClass {
	public void show()
	{
		System.out.println("hello jenkins ");
	}
	public void add()
	{
		int a=5,b=10;
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		
		MyClass m1= new MyClass();
		m1.show();
		m1.add();
	}

}
