# Java try with Resource Statement

- Try with resource is a new feature of Java that was introduced in Java 7 and further improved in Java 9.

- This feature add another way to exception handling with resources management.

- It is also referred as automatic resource management. It close resources automatically by using AutoCloseable interface.

- A resource is an object in a program that must be closed after the program has finished.

> ### Try with Resource Syntax

```java
    try(resource-specification(there can be more than one resource))
    {
        //use the resource
    }
    catch()
    {
        // handler code
    }
```

- This try statement contains a parenthesis in which one or more resources is declared.

- Any object that implements java.lang.AutoCloseable or java.io.Closeable, can be passed as a parameter to try statement.

- A resource is an object that is used in program and must be closed after the program is finished.

- The try-with-resources statement ensures that each resource is closed at the end of the statement of the try block. We do not have to explicitly close the resources.

- In a try-with-resources statement, any catch or finally block is run after the resources declared have been closed.
