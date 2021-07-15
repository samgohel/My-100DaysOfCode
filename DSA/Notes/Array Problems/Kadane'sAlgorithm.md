# Kadane's Algorithm

- While finding the sum of contiguous sub array sum we can simply pick one element and start calculating the sum.

- but for each element we go from one element to till the end and check sum which leads to the O(n^3) time complexity.

- So, to deal with above mentioned issue we can use the previously done calculation and make time complexity O(n^2).

- Even to optimize the problem even more and find best performing case we can use the following method:
  - We take one MaxSum Variable where we store the sum of element.
  - Same as we take key pair value to store the start and end index of the which sum we have stored in MaxSum.
  - We take first element and calculate sum it worth adding to maxSum if yes then we add in to pair of start and end index else we start the new index where that element become the starting and ending index.
