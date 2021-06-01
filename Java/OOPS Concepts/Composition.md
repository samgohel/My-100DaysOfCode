# Composition in Java

- Composition is a more restricted form of Aggregation.

- Composition is a design technique, not a feature of Java but we can achieve it using Java code.

- Composition can be described as when one class which includes another class, is dependent on it in such a way that it cannot functionally exist without the class which is included.

- For example a class Car cannot exist without Engine, as it won't be functional anymore.

- Hence the word Composition which means the items something is made of and if we change the composition of things they change, similarly in Java classes, one class including another class is called a composition if the class included provides core functional meaning to the outer class.

```java
class Car
{
  private Engine engine;

  Car(Engine en)
  {
    engine = en;
  }

}
```

> ### When to use Inheritance and Aggregation?

- When we want to use some property or behavior of any class without the requirement of modifying it or adding more functionality to it, in such case Aggregation is a better option because in case of Aggregation we are just using any external class inside our class as a variable.

- Whereas when you want to use and modify some property or behavior of any external class or may be want to add more function on top of it, its best to use Inheritance.
