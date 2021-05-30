# Method Reference

- Method reference is used to refer method of functional interface. It is compact and easy form of lambda expression.

- Each time when we are using lambda expression to just referring a method, we can replace our lambda expression with method reference.

> ### Types of Method References

- Reference to a static method

  - ContainingClass::staticMethodName

- Reference to an instance method of a particular object

  - containingObject::instanceMethodName

- Reference to an instance method of an arbitrary object of a particular type

  - ContainingType::methodName

- Reference to a constructor
  - ClassName::new
