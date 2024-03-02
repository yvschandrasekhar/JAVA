package com.lambda.pack;

import java.util.function.Consumer;

public class Lambda_03 {

	public static void main(String[] args) {
		Consumer<String>c=(String s)->System.out.println("Consumer interface");
		c.accept("chandu");
	}
}
