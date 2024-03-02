package com.Collection.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo_03 {

	public static void main(String[] args) {
		List<String>li=new ArrayList<String>();
		li.add("yvs");
		li.add("yvscs");
		li.add("chandu");
		li.add("chandu");
		li.add("bunty");
		li.add("dudu");
		ListIterator itr=li.listIterator();
		while(itr.hasNext()) {
			Object s=itr.next();
			System.out.println(s);
		}
	}

}
