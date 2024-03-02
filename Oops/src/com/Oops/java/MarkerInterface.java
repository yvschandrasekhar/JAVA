package com.Oops.java;
class washer
{
	void wash(Object o) {
		if(!(o instanceof washable)) {
			System.out.println("Your object not washable");
			return ;
		}
		System.out.println("your object can be washable");
	}
}
interface washable
{
}
class carrr implements washable
{
}
class phone 
{
}
public class MarkerInterface {

	public static void main(String[] args) {
		washer w=new washer();
		w.wash(new carrr());
		w.wash(new phone());
	}

}
