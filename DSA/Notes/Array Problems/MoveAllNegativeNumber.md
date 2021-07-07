# Move all negative numbers to beginning

> ## Method: 1

- Apply partition method process of quicksort.
- **_Time complexity_**
  - O(n)

> ## Method: 2

- Two pointer Approach
- Check if the left and right which pointer elements are negative then simply increment the left pointer.
- If the left element is positive and right element is negative then simply swap element and do increment and decrement of left and right pointer.
- If the left element is positive and the right element is also positive then simply decrement the right pointer.
- Repeat the above step until the left pointer <= right pointer

* **_Time Complexity_**
  - O(n)
