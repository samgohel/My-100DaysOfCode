# StringBuffer class in Java

- StringBuffer class is used to create a mutable string object.It means, it can be changed after it is created.

- It represents growable and writable character sequence.

- It is similar to String class in Java both are used to create string, but stringbuffer object can be changed.

- So StringBuffer class is used when we have to make lot of modifications to our string.

- It is also thread safe i.e multiple threads cannot access it simultaneously.

- StringBuffer defines 4 constructors.
  - StringBuffer():
    - creates an empty string buffer and reserves space for 16 characters.
  - StringBuffer(int size):
    - It creates an empty string buffer and reserves space for 16 characters.
  - StringBuffer(String str):
    - It creates a stringbuffer object from the specified string.
  - StringBuffer(charSequence []ch):
    - It creates a stringbuffer object from the charsequence array.

> ### Important methods of StringBuffer class

- **_append()_**
  - concatenate the string representation of any type of data to the end of the StringBuffer object.
  - append() method has several overloaded forms.
  ```java
  StringBuffer append(String str)
  StringBuffer append(int n)
  StringBuffer append(Object obj)
  ```
- **_insert()_**
  - inserts one string into another.
  - Here are few forms of insert() method.
  ```java
  StringBuffer insert(int index, String str)
  StringBuffer insert(int index, int num)
  StringBuffer insert(int index, Object obj)
  ```
- **_reverse()_**

  - This method reverses the characters within a StringBuffer object.

- **_replace()_**

  - This method replaces the string from specified start index to the end index.

- **_capacity()_**

  - This method returns the current capacity of StringBuffer object.
  - Empty constructor reserves space for 16 characters.

- **_ensureCapacity()_**
  - This method is used to ensure minimum capacity of StringBuffer object.
  - If the argument of the ensureCapacity() method is less than the existing capacity, then there will be no change in existing capacity.
  - If the argument of the ensureCapacity() method is greater than the existing capacity, then there will be change in the current capacity using following rule: newCapacity = (oldCapacity\*2) + 2.
