package com.innerclasses.pack;

import java.util.function.Consumer;


public class ConsumerInter {
	public static void main(String[] args) {
		Consumer<Integer> con = i->System.out.println("chandu");
		con.accept(10);
		Consumer<String> con1 = i-> System.out.println("we are indians");
		con1.accept("chandu");
	}
}
