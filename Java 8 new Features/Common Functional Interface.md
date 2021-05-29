# Most Used Functional Interface

> ### Function

- Java Function interface (java.util.function.Function) interface is one of the most central functional interfaces in Java.

- The Function interface represents a function (method) that takes a single parameter and returns a single value.

- One of the usages of the Function type in the standard library is the Map.computeIfAbsent method.

- This method returns a value from a map by key, but calculates a value if a key is not already present in a map.

- Example

```java
Map<String, Integer> nameMap = new HashMap<>();
Integer value = nameMap.computeIfAbsent("John", s -> s.length());
```

> ### Predicate

- The Java Predicate interface, java.util.function.Predicate, represents a simple function that takes a single value as parameter, and returns true or false.

- A typical use case of the Predicate lambda is to filter a collection of values.

- Example

```java
List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");

List<String> namesWithA = names.stream()
  .filter(name -> name.startsWith("A"))
  .collect(Collectors.toList());
```

> ### Supplier

- The Java Supplier interface is a functional interface that represents an function that supplies a value

- Not take any arguments

- We typically use it for lazy generation of values.

- This allows us to lazily generate the argument for invocation of this function using a Supplier implementation.

- This can be useful if the generation of the argument takes a considerable amount of time.

- Another use case for the Supplier is defining logic for sequence generation.

- Example

```java
int[] fibs = {0, 1};
Stream<Integer> fibonacci = Stream.generate(() -> {
    int result = fibs[1];
    int fib3 = fibs[0] + fibs[1];
    fibs[0] = fibs[1];
    fibs[1] = fib3;
    return result;
});
```

- Other specializations of the Supplier functional interface include BooleanSupplier, DoubleSupplier, LongSupplier and IntSupplier, whose return types are corresponding primitives.

> ### Consumer

- The Java Consumer interface is a functional interface that represents an function that consumes a value without returning any value.

- A Java Consumer implementation could be printing out a value, or writing it to a file, or over the network etc.

- There are also specialized versions of the Consumer — DoubleConsumer, IntConsumer and LongConsumer — that receive primitive values as arguments.

- More interesting is the BiConsumer interface. One of its use cases is iterating through the entries of a map

- Example

```java
Map<String, Integer> ages = new HashMap<>();
ages.put("John", 25);
ages.put("Freddy", 24);
ages.put("Samuel", 30);

ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));

//Greeting
List<String> names = Arrays.asList("John", "Freddy", "Samuel");
names.forEach(name -> System.out.println("Hello, " + name));
```

- Another set of specialized BiConsumer versions is comprised of ObjDoubleConsumer, ObjIntConsumer, and ObjLongConsumer, which receive two arguments; one of the arguments is generified, and the other is a primitive type.
