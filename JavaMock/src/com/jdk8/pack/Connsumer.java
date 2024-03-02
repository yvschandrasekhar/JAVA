package com.jdk8.pack;

import java.util.function.Consumer;

public class Connsumer {

	public static void main(String[] args) {
		/*Consumer<String> con= new Consumer<String>() {
			public void accept(String s) {
				System.out.println("We are java developers......");
			}
		};
		con.accept("chandu");*/
		/*Consumer<Integer>con=new Consumer<Integer>() {
			public void accept(Integer a) {
				System.out.println("Funtional interfaces....");
			}
		};
		con.accept(10);*/
		Consumer<String>con=(String s)-> {
			System.out.println("Yarramaddi venkata satya chandra sekhar");
			System.out.println("I am a java developer");
		};
		con.accept("chandu");
	}

}
