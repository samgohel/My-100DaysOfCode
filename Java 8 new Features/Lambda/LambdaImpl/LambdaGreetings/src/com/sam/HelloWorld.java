package com.sam;

public class HelloWorld {
	public static void main(String[] args) {
		// 1. We can use interface by providing class implementation
		Greeting greetingUsingInterfaceImpl = new GreetingImpl();
		greetingUsingInterfaceImpl.sayHello("Sam! ");
		
		// 2. We can create anonymous class
		Greeting greeting = new Greeting() {

			@Override
			public void sayHello(String name) {
				System.out.println("Hola! " + name + "From Greeting using anonymous Class");
			}
		};
		greeting.sayHello("Sam! ");
		
		// 2. We can create lambda
		Greeting greetingUsingLambda = (name) -> System.out.println("Hola! " + name + "From Greeting using Lambda");
		greetingUsingLambda.sayHello("Sam! ");
	}

}
