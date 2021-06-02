# Java String class functions

> ### charAt() method

- String charAt() function returns the character located at the specified index.
- Index of a String starts from 0.

> ### equalsIgnoreCase() method

- String equalsIgnoreCase() determines the equality of two Strings, ignoring their case (upper or lower case doesn't matter with this method).

> ### indexOf() method

- String indexOf() method returns the index of first occurrence of a substring or a character.

- IndexOf() method has four override methods:

  - int indexOf(String str)

    - It returns the index within this string of the first occurrence of the specified substring.

  - int indexOf(int ch, int fromIndex)

    - It returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.

  - int indexOf(int ch)

    - It returns the index within this string of the first occurrence of the specified character.

  - int indexOf(String str, int fromIndex)
    - It returns the index within this string of the first occurrence of the specified substring, starting at the specified index.

> ### length() method

- String length() function returns the number of characters in a String.

> ### replace() method

- String replace() method replaces occurrences of character with a specified new character.

> ### substring() method

- String substring() method returns a part of the string.

- substring() method has two override methods.

  - public String substring(int begin);
  - public String substring(int begin, int end);

- The first argument represents the starting point of the subtring.

- If the substring() method is called with only one argument, the subtring returns characters from specified starting point to the end of original string.

- If method is called with two arguments, the second argument specify the end point of substring.

> ### toLowerCase() method

- String toLowerCase() method returns string with all uppercase characters converted to lowercase.

> ### toUpperCase() method

- This method returns string with all lowercase character changed to uppercase.

> ### valueOf() method

- String class uses overloaded version of valueOf() method for all primitive data types and for type Object.

- valueOf() function is used to convert primitive data types into Strings.

> ### toString() method

- String toString() method returns the string representation of an object.
- is declared in the Object class, hence can be overridden by any java class.
- If we don't override the toString() method and directly print the object, then it would print the object id that contains some hashcode.

> ### trim() method

- This method returns a string from which any leading and trailing whitespaces has been removed.

> ### contains()Method

- String contains() method is used to check the sequence of characters in the given string.
- It returns true if a sequence of string is found else it returns false.

> ### endsWith() Method

- String endsWith() method is used to check whether the string ends with the given suffix or not.
- It returns true when suffix matches the string else it returns false.

> ### format() Method

- String format() is a string method. It is used to the format of the given string.

```java
public class Demo {
    public static void main(String[] args) {
        String a1 = String.format("%d", 125);
        String a2 = String.format("%s", "studytonight");
        String a3 = String.format("%f", 125.00);
        String a4 = String.format("%x", 125);
        String a5 = String.format("%c", 'a');
        System.out.println("Integer Value: "+a1);
        System.out.println("String Value: "+a2);
        System.out.println("Float Value: "+a3);
        System.out.println("Hexadecimal Value: "+a4);
        System.out.println("Char Value: "+a5);
    }
}
```

> ### getBytes() Method

- String getBytes() method is used to get byte array of the specified string.

> ### getChars() Method

- String getChars() method is used to copy the content of the string into a char array.

> ### isEmpty() Method

- String isEmpty() method is used to check whether the string is empty or not. It returns true when length string is zero else it returns false.

> ### join() Method

- String join() method is used to join strings with the given delimiter. The given delimiter is copied with each element

> ### startsWith() Method

- String startsWith() is a string method in java. It is used to check whether the given string starts with given prefix or not. It returns true when prefix matches the string else it returns false.

> ###
