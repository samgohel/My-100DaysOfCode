# try and catch in Java

- Try and catch both are Java keywords and used for exception handling.

- The try block is used to enclose the suspected code. Suspected code is a code that may raise an exception during program execution.

- The catch block also known as handler is used to handle the exception.

- It handles the exception thrown by the code enclosed into the try block.

- Try block must provide a catch handler or a finally block.

> ### Try Catch Syntax

```java
try{
  // suspected code
}catch(ExceptionClass ec){
  // Handling Code
}
```

> ### Multiple catch blocks

- A try block can be followed by multiple catch blocks.

- It means we can have any number of catch blocks after a single try block.

- If an exception occurs in the guarded code(try block) the exception is passed to the first catch block in the list.

- If the exception type matches with the first catch block it gets caught, if not the exception is passed down to the next catch block.

- This continue until the exception is caught or falls through all catches.

> ### Multiple Catch Syntax

```java
    try
    {
        // suspected code
    }
    catch(Exception1 e)
    {
        // handler code
    }
    catch(Exception2 e)
    {
        // handler code
    }
```

> ### Nested try statement

- try statement can be nested inside another block of try.

- Nested try block is used when a part of a block may cause one error while entire block may cause another error.

- In case if inner try block does not have a catch handler for a particular exception then the outer try catch block is checked for match.

- While using multiple catch block, always make sure that sub-classes of Exception class comes before any of their super classes. Else we will get compile time error.
