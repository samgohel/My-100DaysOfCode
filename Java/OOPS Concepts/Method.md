# Methods in Java

- Method in Java is similar to a function defined in other programming languages.

- A method is a collection of statements that are grouped together to perform an operation.

- Method describes behavior of an object.

- For example, if we have a class Human, then this class should have methods like eating(), walking(), talking() etc, which describes the behavior of the object.

- **_Method Contains_**

  - Modifier

    - Modifier are access type of method.

  - Return Type

    - A method may return value.
    - Data type of value return by a method is declare in method heading.

  - Method name

    - Actual name of the method.

  - Parameter

    - Value passed to a method.

  - Method body
    - collection of statement that defines what method does.

- Methods are called to perform the functionality implemented in it. We can call method by its name and store the returned value into a variable.

> ### Parameter Vs. Argument in a Method

- Parameter is variable defined by a method that receives value when the method is called.

- Whenever we define a function we introduce our compiler with some variables that are being used in the running of that function. These variables are often termed as Parameters.

- Parameter are always local to the method they don't have scope outside the method.

- Argument is a value that is passed to a method when it is called.

- Whenever any function is called during the execution of the program there are some values passed with the function. These values are called arguments.

- There are two ways to pass an argument to a method

  - call-by-value

    - In this approach copy of an argument value is pass to a method.
    - Changes made to the argument value inside the method will have no effect on the arguments.

  - call-by-reference
    - In this reference of an argument is pass to a method.
    - Any changes made inside the method will affect the argument value.

- When the values of parameters are copied into another variable, it is known as pass by value and when a reference of a variable is passed to a method then it is known as pass by reference.

- It is one of the feature of C language where address of a variable is passed during function call and that reflect changes to original variable.

- In case of Java, we there is no concept of variable address, everything is based on object. So either we can pass primitive value or object value during the method call.

- Java is strictly pass by value. It means during method call, values are passed not addresses.

- There is no concept of call-by-reference in Java. Java supports only call by value.
