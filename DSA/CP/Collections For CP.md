# Java useful Collections for competitive programming

> ### ArrayList

- Dynamic Sized Array that allows insertions and deletions without caring of size of the array.
- It also has advantages of plain arrays like random access and cache friendliness.
- Java ArrayList supports many additional operations like indexOf(), remove(), etc.

> ### Queue

- An interface implemented by LinkedList.
- Useful in situations where we wish to have FIFO order of items.
- Example problems are, generate numbers with given digit, first non-repeating character in a stream, level order traversal of a tree and its variations, BFS of a graph and its variations.

> ### Stack

- Used in situations where we wish to have LIFO order.
- Example problems are balanced parenthesis, stock span problem, next greater element and largest area in a histogram.

> ### Deque

- Deque is an interface that is implemented by LinkedList class.
- Dequeue supports insertions and deletions at both ends in O(1) time.
- We can use Deque interface to implement Queue and Stack both.
- In fact, it is recommended to use Deque to implement Stack in Java because the Stack class in Java is an old style class.
- Example problems on Deque are, visit all petrol pumps and maximums of all subarrays of size k.

> ### TreeSet & TreeMap

- Both of these implement self balancing binary search tree (Red Black Tree in particular).
- Useful in situations where we wish to maintain sorted items with moderate (better than array and worse than hashing) search, insert and delete query time.
- Example problems are, Closest greater or same value on left side, Find closest value for every element in array, etc.
- We use TreeSet when we wish to store only keys and TreeMap when we wish to store key value pairs.

> ### HashSet & HashMap

- Both of these implement hashing with chaining.
- Useful when we wish to have fast search, insert and delete (all three operations are O(1)).
- There are many popular problems, count distinct elements, frequencies of array items, subarray with 0 sum and union and intersection of two unsorted arrays.

> ### LinkedHashSet & LinkedHashMap

- Implement hashing with chaining, but additionally also maintain insertion order.
- HashSet and HashMap do not maintain any order.
- So if we wish to print distinct elements in same order as they appear in input, we need to use LinkedHashSet and if we wish to print items and their frequencies in same order as they appear, we need to used LinkedHashMap.

> ### PriorityQueue

- Implement Min Heap by default.
- We can create a Max Heap also by passing Collections.reverseOrder() as a parameter.
- PriorityQueue is used whenever we wish to efficiently find minimum or maximum element.
- It is used to implement popular algorithms like Prim’s Algorithm, Dijkstra’s shortest Path, Huffman Coding, K Largest Elements, Maximum Toys to Purchase and Merge K Sorted Arrays, Median of a Stream.
