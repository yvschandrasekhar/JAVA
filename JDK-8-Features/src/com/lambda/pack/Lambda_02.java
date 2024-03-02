package com.lambda.pack;
interface A
{
	void show(int i);
}
/*class abc implements A
{
	public void show()
	{
		System.out.println("Hello");
	}
}*/
public class Lambda_02 {

	public static void main(String[] args) {
		/*A a=new A() {
			public void show(int i)
			{
				System.out.println("Hello");
			}
		};
		a.show();*/
		A a=(i)-> System.out.println("Hello");
		a.show(10);
	}

}
