package com.oops.pack;
class up{
    void m1()
    {
        System.out.println("m1 in up");
    }
    void m2()
    {
    	System.out.println("m2 in up");
    }
}
class down extends up
{
	void m3()
    {
        System.out.println("m1 in down");
    }
	void m4()
    {
        System.out.println("m4 in down");
    }
}

public class Test1 {

	public static void main(String[]args) {
		up u=new down();
		u.m1();
		u.m2();
		down d=(down)u;
		d.m1();
		d.m2();
		d.m3();
		d.m4();
	}

}
