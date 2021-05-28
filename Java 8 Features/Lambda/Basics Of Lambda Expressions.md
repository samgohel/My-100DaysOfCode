# Lambda Expression Basics

> ### Why We Need Lambda Expression?

- One issue with anonymous classes is that if the implementation of your anonymous class is very simple, such as an interface that contains only one method, then the syntax of anonymous classes may seem unwieldy and unclear. In these cases, you're usually trying to pass functionality as an argument to another method, such as what action should be taken when someone clicks a button. Lambda expressions enable you to do this, to treat functionality as method argument, or code as data.

* Enables Functional Programing

* In functional programming, code can be treated as data. For this purpose Lambda expressions are introduced. They can be used to pass a block of code to another method or object.

* Readable and cosine code

* Sequential and parallel execution support by passing behavior as an argument in methods.

- Lambda expressions also improve the Collection libraries making it easier to iterate through, filter, and extract data from a Collection.

* we can easily distribute processing of collection over multiple threads.

> ### What is lambda Expression?

- A Java lambda expression is a function which can be created without belonging to any class.

* The Lambda expression is used to provide the implementation of an interface which is functional interface.

- A Java lambda expression can be passed around as if it was an object and executed on demand.

- Lambda expression is anonymous function,
  - No Name
  - No Modifier
  - No Return Type

> ### What lambda expression Contains

- Argument-list
- Arrow-token
- Body

> ### Syntax of lambda expression

```java
parameter -> expression

(parameter1, parameter2) -> expression

(parameter1, parameter2) -> { code block }
```

> ### Ideal Use Case for Lambda Expressions

- if we are encapsulating a single unit of behavior that we want to pass to other code. For example, we would use a lambda expression if we want a certain action performed on each element of a collection, when a process is completed, or when a process encounters an error.

- if we need a simple instance of a functional interface and none of the preceding criteria apply (for example, we do not need a constructor, a named type, fields, or additional methods).

- Commonly used to implement simple event listeners / callbacks, or in functional programming with the Java Streams API.

> ### Topic good to know before lambda expression

- Anonymous Inner Class

- Functional Interfaces

- Java Method References

- Predicate

- Consumer

- Function

- Supplier

- UnaryOperator

- BinaryOperator
