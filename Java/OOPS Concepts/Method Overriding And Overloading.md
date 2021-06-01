# Method Overloading And Overriding in Java

> ### Method Overriding in Java

- Method overriding is a process of overriding base class method by derived class method with more specific definition.

- Method overriding performs only if two classes have is-a relationship. It mean class must have inheritance. In other words, It is performed between two classes using inheritance relation.

- In overriding, method of both class must have **_same name and equal number of parameters_**.

- Method overriding is also referred to as **_runtime polymorphism_** because calling method is decided by JVM during runtime.

- The key benefit of overriding is the ability to define method that's specific to a particular subclass type.

> ### Rules for Method Overriding

- Method name must be same for both parent and child classes.

- Access modifier of child method must not restrictive than parent class method.

- Private, final and static methods cannot be overridden.

- There must be an IS-A relationship between classes (inheritance).

- Static methods cannot be overridden because, a static method is bounded with class where as instance method is bounded with object.

```java
class Animal
{
    public void eat()
    {
        System.out.println("Eat all eatables");
    }
}

class Dog extends Animal
{
    public void eat()   //eat() method overridden by Dog class.
    {
        System.out.println("Dog like to eat meat");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}
```

> ### Covariant return type

- it is possible to override a method by changing its return type.

- If subclass override any method by changing the return type of super class method, then the return type of overridden method must be subtype of return type declared in original method inside the super class.

- This is the only way by which method can be overridden by changing its return type.

> ### Method overloading

- Method overloading is a concept that allows to declare multiple methods with same name but different parameters in the same class.

- Java supports method overloading and always occur in the same class(unlike method overriding).

- Method overloading is one of the ways through which java supports polymorphism.

- Method overloading can be done by changing number of arguments or by changing the data type of arguments.

- If two or more method have same name and same parameter list but differs in return type can not be overloaded.

- Overloaded method can have different access modifiers and it does not have any significance in method overloading.

- Two different ways of method overloading.
  - Different datatype of arguments
  - Different number of arguments

| Method Overloading                                                               | Method Overriding                                                                    |
| -------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------ |
| Parameter must be different and name must be same                                | Both Name and parameter must be same                                                 |
| Compile time polymorphism.                                                       | Runtime polymorphism.                                                                |
| Increase readability of code                                                     | increase reusability of code                                                         |
| Access specifier can be changed                                                  | Access specifier cannot be more restrictive than original (can be less restrictive). |
| Performed within a class or in child class                                       | performed between two classes using inheritance relation.                            |
| Use static binding                                                               | Uses Dynamic binding                                                                 |
| Also known as Compile time polymorphism or static polymorphism or early binding. | Also known as run time polymorphism or later biding.                                 |
|                                                                                  |                                                                                      |
