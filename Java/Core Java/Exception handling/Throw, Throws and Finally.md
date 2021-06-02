# Throw, throws and finally

- Throw, throws and finally are the keywords in Java that are used in exception handling.

- The throw keyword is used to throw an exception and throws is used to declare the list of possible exceptions with the method signature.

- Whereas finally block is used to execute essential code, specially to release the occupied resources.

> ### Throw

- The throw keyword is used to throw an exception explicitly.

- Only object of Throwable class or its sub classes can be thrown.

- Program execution stops on encountering throw statement, and the closest catch statement is checked for matching type of exception.

> ### Java throws Keyword

- The throws keyword is used to declare the list of exception that a method may throw during execution of program.

- Any method that is capable of causing exceptions must list all the exceptions possible during its execution, so that anyone calling that method gets a prior knowledge about which exceptions are to be handled.

```java
    type method_name(parameter_list) throws exception_list
    {
        // definition of method
    }
```

> ### Difference between throw and throws
>
> | throw                                                                 | throws                                                                         |
> | --------------------------------------------------------------------- | ------------------------------------------------------------------------------ |
> | used to throw an exception explicitly.                                | used to declare an exception possible during its execution.                    |
> | followed by an instance of Throwable class or one of its sub-classes. | followed by one or more Exception class names separated by commas.             |
> | declared inside a method body.                                        | used with method signature (method declaration).                               |
> | We cannot throw multiple exceptions using throw keyword.              | We can declare multiple exceptions (separated by commas) using throws keyword. |

> ### finally clause

- A finally keyword is used to create a block of code that follows a try block.

- A finally block of code is always executed whether an exception has occurred or not.

- Using a finally block, it lets you run any cleanup type statements that you want to execute, no matter what happens in the protected code.
