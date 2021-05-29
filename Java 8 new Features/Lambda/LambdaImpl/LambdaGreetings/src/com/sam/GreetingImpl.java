package com.sam;

public class GreetingImpl implements Greeting {

	@Override
	public void sayHello(String name) {
		System.out.println("Hola! " + name + "From Greeting using Impl.");
	}

}
