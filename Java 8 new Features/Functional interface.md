# Functional Interfaces Basic

> ### What is Functional Interface?

- An interface with exactly one abstract method is called Functional Interface.

- @FunctionalInterface annotation is added so that we can mark an interface as functional interface (it’s best practice).

- If the interface is annotated with @FunctionalInterface annotation and we try to have more than one abstract method, it throws compiler error.

> ### Why we have Functional Interfaces?

- Functional Interface serves as a data type for Lambda expressions. Since a Functional interface contains only one abstract method, the implementation of that method becomes the code that gets passed as an argument to another method.

- Functional Interfaces are mainly used in Lambda expressions, Method reference and constructor references.

* Collections API has been rewritten and new Stream API is introduced that uses a lot of functional interfaces.

> ### List Of Functional Interfaces in java

- Consumer

- Supplier

- Function

- Predicate

- java.lang.Runnable

- You can see Full list [Here](https://www.educative.io/edpresso/a-list-of-all-the-functional-interfaces-in-java)

- [Here](https://dzone.com/articles/cheatsheet-java-functional-interfaces) You can find a cheat sheet to remember the functional interfaces of the function package.
