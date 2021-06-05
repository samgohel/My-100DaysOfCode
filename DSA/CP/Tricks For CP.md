# Java tricks for competitive programming (for Java 8)

> ### Checking if the number is even or odd without using the % operator

- this trick is not much better than using a % operator but is sometimes efficient (with large numbers).
- **_Use & operator_**

```java
System.out.println((a & 1) == 0 ?  "EVEN" : "ODD" );
```

- **_Example_**

```java
num = 5
Binary: "101 & 1" will be 001, so false

num = 4
Binary: "100 & 1" will be 000, so true.
```

> ### Fast Multiplication or Division by 2

- Multiplying by 2 means shifting all the bits to left.
- dividing by 2 means shifting to the right.
- **_Example_**

```java
2 (Binary 10): shifting left 4 (Binary 100) and right 1 (Binary 1)

n = n << 1;   // Multiply n with 2
n = n >> 1;   // Divide n by 2
```

> ### Swapping of 2 numbers using XOR

- This method is fast and doesn’t require the use of the 3rd variable.
- **_Example_**

```java
 // A quick way to swap a and b
  a ^= b;
  b ^= a;
  a ^= b;
```

> ### For String manipulations

- Use StringBuffer for string manipulations, as String in java is immutable.

> ### Calculating the most significant digit:

- To calculate the most significant digit of any number log can be directly used to calculate it.
- **_Example_**

```java
Suppose the number is N then

Let double K = Math.log10(N);
now K = K - Math.floor(K);
int X = (int)Math.pow(10, K);
X will be the most significant digit.
```

> ### Calculating the number of digits directly

- To calculate the number of digits in a number, instead of looping we can efficiently use log
- **_Example_**

```java
No. of digits in N = Math.floor(Math.log10(N)) + 1;
```

> ### Inbuilt GCD Method

- Java has inbuilt GCD method in BigInteger class.
- It returns a BigInteger whose value is the greatest common divisor of abs(this) and abs(val). Returns 0 if this==0 && val==0.
- **_Example_**

```java
import java.math.BigInteger;

class Test {
    public static int gcd(int a, int b)
    {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

    public static long gcd(long a, long b)
    {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.longValue();
    }

    // Driver method
    public static void main(String[] args)
    {
        System.out.println(gcd(3, 5));
        System.out.println(gcd(10000000000L, 600000000L));
    }
}
```

> ### checking for a prime number

- Java has an inbuilt isProbablePrime() method in BigInteger class.
- It returns true if this BigInteger is probably prime(with some certainty), false if it’s definitely composite.
- **_Example_**

```java
BigInteger.valueOf(1235).isProbablePrime(1)
```

> ### Efficient trick to know if a number is a power of 2

- The normal technique of division the complexity comes out to be O(logN), but it can be solved using O(v) where v is the number of digits of the number in binary form.
- **_Example_**

```java
/* Method to check if x is power of 2*/
static boolean isPowerOfTwo (int x)
{
     /* First x in the below expression is
     for the case when x is 0 */
      return x!=0 && ((x&(x-1)) == 0);
}
```

> ### Sorting Algorithm

- Arrays.sort() used to sort elements of an array.
- Collections.sort() used to sort elements of a collection.
- For primitives, Arrays.sort() uses dual pivot quicksort algorithms.

> ### Searching Algorithm

- Arrays.binarySearch()(SET 1 | SET2) used to apply binary search on a sorted array.
- Collections.binarySearch() used to apply binary search on a collection based on comparators.

> ### Copy Algorithm

- Arrays.copyOf() and copyOfRange() copy the specified array.
- Collections.copy() copies specified collection.

> ### Rotation and Frequency

- We can use Collections.rotate() to rotate a collection or an array by a specified distance.
- we can also use Collections.frequency() method to get the frequency of a specified element in a collection or an array.

> ### Use Wrapper class functions for getting radix conversions of a number

- Sometimes you require radix conversion of a number. For this, you can use wrapper classes.
- **_Example_**

```java
class Test {
    // Driver method
    public static void main(String[] args)
    {
        int a = 525;
        long b = 12456545645L;

        String binaryA = Integer.toString(a, 2);
        System.out.println("Binary representation"
                           + " of A : " + binaryA);
        String binaryB = Long.toString(b, 2);
        System.out.println("Binary representation"
                           + " of B : " + binaryB);
        String octalA = Integer.toString(a, 8);
        System.out.println("Octal representation"
                           + " of A : " + octalA);
        String octalB = Long.toString(b, 8);
        System.out.println("Octal representation"
                           + " of B : " + octalB);
    }
}
```
