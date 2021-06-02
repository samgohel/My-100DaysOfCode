# Java Exception Handling

- Exception Handling is a mechanism to handle exception at runtime.

- Exception is a condition that occurs during program execution and lead to program termination abnormally.

- There can be several reasons that can lead to exceptions, including programmer error, hardware failures, files that need to be opened cannot be found, resource exhaustion etc.

- Java exception handling provides a meaningful message to the user about the issue rather than a system generated message, which may not be understandable to a user.

> ### How to Handle Exception

- Java provides controls to handle exception in the program.

- These controls are listed below.

  - **_Try:_**
    - It is used to enclose the suspected code.
  - **_Catch:_**
    - It acts as exception handler.
  - **_Finally:_**
    - It is used to execute necessary code.
  - **_Throw:_**
    - It throws the exception explicitly.
  - **_Throws:_**
    - It informs for the possible exception.

> ### Types of Exceptions

- In Java, exceptions broadly can be categories into checked exception, unchecked exception and error based on the nature of exception.

- **_Checked Exception_**

  - The exception that can be predicted by the JVM at the compile time.
  - These type of exceptions must be checked at compile time.
  - example : File that need to be opened is not found, SQLException etc.

- **_Unchecked Exception_**

  - Unchecked exceptions are the class that extends RuntimeException class.
  - Unchecked exception are ignored at compile time and checked at runtime.
  - Unchecked exceptions are checked at runtime.
  - For example : ArithmeticException, NullPointerException, Array Index out of Bound exception.

- **_Error_**
  - Errors are typically ignored in code because we can rarely do anything about an error.
  - This type of error cannot be handled in the code.
  - For example, if stack overflow occurs, an error will arise.

> ### Java Exception class Hierarchy

- All exception types are subclasses of class Throwable, which is at the top of exception class hierarchy.

- **_Exception class_** is for exceptional conditions that program should catch. This class is extended to create user specific exception classes.

- **_RuntimeException_** is a subclass of Exception. Exceptions under this class are automatically defined for programs.

- Exceptions of type **_Error_** are used by the Java run-time system to indicate errors having to do with the run-time environment, itself. Stack overflow is an example of such an error.
