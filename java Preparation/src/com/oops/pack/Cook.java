package com.oops.pack;
interface Cookable{
}
class Vegetables implements Cookable{
}
class Fruits{
}

public class Cook {
	public void cooking(Object o) {
		if(o instanceof Vegetables ) {
			System.out.println("Your items are cookable");
		}else {
			System.out.println("Your items are not cookable");
		}
	}
	public static void main(String[] args) {
		Cook ck = new Cook();
		ck.cooking(new Vegetables());
		ck.cooking(new Fruits());
	}

}
