# Reverse an array in Java

> ## Simple Method Using New Array

- Create new array of the size of input array.
- Iterate Array till length of input array.
  - Put ith Index element in last position of new array.
  - Decrease the last element of new array.

> ## Without New Array

- Iterate the input array till half the size of array.
- Store the ith (current element) of input array in temp variable.
- Swap the ith (current element) element of input array at the array size minus ith element position minus one (Swap With Last Element).
- Swap Or Set last element with the temp.

> ## Using Collections

- Convert the input array to list using java.util.Arrays.asList(array).
- Use java.util.Collections.reverse(List list) to reverse array.

> ## For Just Print Array In Reverse Order

- Simply Start loop from the last element and print the ith element.
