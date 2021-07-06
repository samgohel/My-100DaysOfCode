# Maximum and minimum element of an array

> ## Using Simple Linear Search

- Define inner class with min and max variable
- Check if array length is only one then return it as min and max.
- Check if there are more than one element in array then compare index of 0 and index of 1.
- else in for loop check from index 2 to n and compare each with min and max and set new min max.

* **_Time Complexity_**
  - O(n)
  - Total number of comparisons is 1 + 2(n-2) in the worst case and 1 + n – 2 in the best case.
  - Worst case occurs when elements are sorted in descending order and the best case occurs when elements are sorted in ascending order.

> ## Tournament Method

- If array size is one return that element as min and max.
- If array size is 2 then one comparison to determine the min and max.
- recur for max and min of left half.
- recur for max and min of right half.
- one comparison for determine the true max of two element.
- one comparison for determine the true min of two element.
- return min and max pair.
- **_Time Complexity_**
  - O(N)
  - Total number of comparisons: let the number of comparisons be T(n).

```java
  T(n) can be written as
  T(n) = T(floor(n/2)) + T(ceil(n/2)) + 2
  T(2) = 1
  T(1) = 0
```

```java
if n is power of 2, then we can write T(n) as
  T(n) = 2T(n/2) + 2
  after solving above recursion we get
  T(n) = 3n/2 - 2
```

- Thus, the approach does 3n/2-2 comparison if n is power of 2.And it does more then 3n/2-2 comparisons if n is not a power of 2.

> ## Compare in pairs

- if n is odd then initialize min and max as first element.
- if n is even then initialize min and max as minimum and maximum of first two elements respectively.

* For rest of the element pick them in pair & compare their max and min with actual min and max respectively.

- **_Time Complexity_**
  - O(n)
