# Union and Intersection of two sorted arrays

> ## Method: 1

- Two index variable i=0 & j=0
- If array1[i] element is
  - Smaller than array2[j] then print array1[i] and increment i
- If array1[i] element is
  - grater than array2[j] then print array2[j] and increment j
- If both are same then print any of them and increment both i and j
- Print remaining elements of the large array

* **_Time Complexity_**
  - O(m + n)

> ## Method: 2

- Handling duplicates in array
- for check double, check whether adjacent elements are equal

> ## For Unsorted Array

- We can use set cause the set DS allows only distinct element.
- We can also use Map DS because it stores only distinct.
