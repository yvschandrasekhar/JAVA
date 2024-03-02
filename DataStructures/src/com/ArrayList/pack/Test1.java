package com.ArrayList.pack;

public class Test1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("yvs");
		al.add("yvscs");
		al.add("chandu");
		al.add("bunty");
		al.add("dudu");
		al.add(2, "java");
		al.add(3, "sql");
		al.add(4, "web");
		al.add(5, "react");
		al.add(6, "Nodejs");
		al.remove(8);
		al.show();
		System.out.println("---------------------------------");
		System.out.println(al.size());
		
		
	}

}
