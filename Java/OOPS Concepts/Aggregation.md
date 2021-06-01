# Aggregation (HAS-A relationship) in Java

- Aggregation is a term which is used to refer one way relationship between two objects.

- For example, Student class can have reference of Address class but vice versa does not make sense.

- In Java, aggregation represents HAS-A relationship, which means when a class contains reference of another class known to have aggregation.

- The HAS-A relationship is based on usage, rather than inheritance. In other words, class A has-a relationship with class B, if class A has a reference to an instance of class B.

- example

```java
Class Address{
    int street_no;
    String city;
    String state;
    int pin;
    Address(int street_no, String city, String state, int pin ){
        this.street_no = street_no;
        this.city = city;
        this.state = state;
        this.pin = pin;
    }
}

class Student
{
  String name;
  Address ad;
}
```

- The main advantage of using aggregation is to maintain code re-usability.

- If an entity has a relation with some other entity than it can reuse code just by referring that.

-
