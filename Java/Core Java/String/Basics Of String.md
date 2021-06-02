# Introduction to String in Java

- String is an object that represents sequence of characters.

- In Java, String is represented by String class which is located into java.lang package

- In java, every string that we create is actually an object of type String.

- One important thing to notice about string object is that string objects are immutable that means once a string object is created it cannot be changed.

- The Java String class implements **_Serializable_**, **_Comparable_** and **_CharSequence_** interface.

- CharSequence Interface is used for representing a sequence of characters.

- CharSequence interface is implemented by String, StringBuffer and StringBuilder classes.

> ### Creating a String object

- **_Using a String literal._**

  - String literal is a simple string enclosed in double quotes " ".

  - A string literal is treated as a String object.

```java
public class Demo{
    public static void main(String[] args) {
    	String s1 = "Hello Java";
    	System.out.println(s1);
    }
}
```

- **_Using new Keyword_**

  - We can create a new string object by using new operator that allocates memory for the object.

  - We are creating a new object using new operator, and thus it gets created in a non-pool memory area of the heap.

- Each time we create a String literal, the JVM checks the string pool first.

- If the string literal already exists in the pool, a reference to the pool instance is returned. If string does not exist in the pool, a new string object is created, and is placed in the pool.

- String objects are stored in a special memory area known as string constant pool inside the heap memory.
