# Sort Array Contain only element 0,1,2 without sorting algorithm.

- This problem is similar to Segregate 0s and 1s in an array and problems are variation of famous Dutch national flag problem.

> ## Method: 1

- Keeping three indicator
  - low = 1
  - mid = 1
  - high = n
- Create 4 ranges
  - 1 to low the range containing 0
  - low to mid the range containing 1
  - mid to high the range containing unknown elements
  - high to N the range containing 2
- Traverse the array from start to end and mid is less than high
  - if the element is 0
    - then swap the element with at the index low and update low = low + 1 and mid=mid + 1
  - if the element is 1
    - then update mid=mid + 1
  - if the element is 2
    - then swap the element with the element at index high and update high=high - 1 and update i=i - 1

* Print output array.

* **_Time Complexity_**
  - O(n)
  * Only one traversal of array is needed.

> ## Method: 2

- Keep three counter
  - c0 to count 0s
  - c1 to count 1s
  - c2 to count 2s

* Traverse through array and increase the count of
  - c0 if Element is 0
  - c1 if Element is 1
  - c2 if Element is 2
* Now again traverse the array and replace
  - first c0 element with 0
  - next c1 element with 1
  - and next c2 with 2
* **_Time Complexity_**
  - O(n)
  - Only two traversal of array is needed
