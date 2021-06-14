# Collections Introduction In Java

> ## Iterable Interface

- Located in java util package.

- Returns an iterator over elements

- Implementing this interface allows an object to be the target of the "for-each loop" statement.

- Commonly used Methods
  - default void forEach() throws NullPointerException.

---

> ## Iterator Interface

- Located in java util package.

- Differ from enumerations in two ways

  - Allow the caller to remove elements from the underlying collection during the iteration with well-defined semantics.
  - Method names have been improved.

- This interface is a member of the Java Collections Framework.

- Commonly used Methods
  - boolean hasNext()
  - E Next()
  - default void remove() throw UnsupportedOperationException

---

> ## Collection Interface

- located in java util package.

- Extends Iterable

- This interface is a member of the Java Collections Framework.

* Commonly used Methods

  - int size()

  - boolean isEmpty()

  - boolean contains(Object o) throws ClassCastException, NullPointerException

  - Object[] toArray()

  - boolean add(E e) throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException, IllegalStateException

  - boolean remove(Object o) throws UnsupportedOperationException, ClassCastException, NullPointerException

  - default boolean removeIf() throws NullPointerException, UnsupportedOperationException

  - There is also methods like containsAll, addAll, removeAll, retainAll, clear, equals, hashCode, and parallelStream.

---

> ## List Interface

- Located in java util package.

- Extends Collection Interface.

* An ordered And Indexed Collection.

* Unlike sets, lists typically allow duplicate elements.

* Provides a special iterator, called a ListIterator that allows element insertion and replacement, and bidirectional access in addition to the normal operations that the Iterator interface provides.

* If this list contains more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE when we call size() method.

* toArray() method must allocate a new array even if this list is backed by an array caller is thus free to modify the returned array.

* lastIndexOf() will return index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.

* Commonly used Methods

  - int size()

  - boolean isEmpty()

  - boolean contains(Object o) throw NullPointerException, ClassCastException

  - <T> T[] toArray(T[] a) throw ArrayStoreException, NullPointerException

  - boolean add(E e) throw UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException

  - E set(int index, E element) throw UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException, IndexOutOfBoundsException

  - boolean remove(Object o) throw ClassCastException, NullPointerException, UnsupportedOperationException

  - default void replaceAll(UnaryOperator<E> operator) throw UnsupportedOperationException, NullPointerException.

  - default void sort(Comparator<? super E> c) throw ClassCastException, UnsupportedOperationException, IllegalArgumentException

  - int lastIndexOf(Object o) throw ClassCastException, NullPointerException

  - List<E> subList(int fromIndex, int toIndex) throw IndexOutOfBoundsException.

  * There is also methods like addAll, addAll with index number, removeAll, clear, equals, hashCode, get, index based add, index based remove, indexOf, and parallelStream.

### ArrayList Class

- Located in java util package.

- Extends AbstractList and implements List, RandomAccess, Cloneable and Serializable.

- Resizable-array implementation of the List interface.

- DEFAULT_CAPACITY = 10;

- Implements all optional list operations, and permits all elements, including null.

- This class provides methods to manipulate the size of the array that is used internally to store the list.

- This class is roughly equivalent to Vector, except that it is unsynchronized.

- The size(), isEmpty(), get(), set(), iterator and listIterator operations run in constant time.

- add operation run in amortized constant time that is, adding n elements requires O(n) time.

- The capacity is the size of the array used to store the elements in the list. It is always at least as large as the list size.

- EnsureCapacity increase the capacity of an ArrayList instance before adding a large number of elements.

- The iterators returned by this class's and methods are fail-fast if the list is structurally modified at any time after the iterator is created, in any way except through the iterator's own ListIterator remove or ListIterator add methods, the iterator will throw a ConcurrentModificationException.

- Commonly used Methods
  - public int size()
  - public boolean isEmpty(
  - public boolean contains(Object o)
  - public int indexOf(Object o)
  - public int lastIndexOf(Object o)
  - public Object[] toArray()
  - public void sort(Comparator<? super E> c)
  - public void replaceAll(UnaryOperator<E> operator)
  - public boolean removeIf(Predicate<? super E> filter)
  - public void forEachRemaining(Consumer<? super E> action)
  - protected void removeRange(int fromIndex, int toIndex)
  - public void add(int index, E e)
  - public boolean add(E e)
  - public E set(int index, E element)
- Iterate Through ArrayList
  - for loop
  - for each loop
  - Iterator

### LinkedList Class

- Located in java util package

- LinkedList Class Extends AbstractSequentialList and implements List, Deque, Cloneable, Serializable.

- Doubly-linked list implementation of the List and Deque interfaces.

- Operations that index into the list will traverse the list from the beginning or the end, whichever is closer to the specified index.

- Not synchronized.

- Returned Interator and methods are fail-fast.

- Commonly used Methods

  - public E getFirst() throws NoSuchElementException

  - public E getLast() throws NoSuchElementException

  * public E removeFirst() throws NoSuchElementException

  * public E removeLast() throws NoSuchElementException

  * public void addFirst(E e)

  * public void addLast(E e)

  * public boolean add(E e)

  * public E get(int index) throws IndexOutOfBoundsException

  * public E set(int index, E element) throws IndexOutOfBoundsException

  * public void add(int index, E element) throws IndexOutOfBoundsException

  * public int lastIndexOf(Object o)

  * public E peek()

  * public E poll()

  * public boolean offer(E e)

  * public boolean offerFirst(E e)

  * public boolean offerLast(E e)

  * public E peekFirst()

  * public E peekLast()

  * public void push(E e)

  * public E pop() throws NoSuchElementException

  * public boolean removeFirstOccurrence(Object o)

  * public boolean removeLastOccurrence(Object o)

### Vector

- Located in java util package

- extends AbstractList implements List, RandomAccess, Cloneable, Serializable.

- Implements a growable array of objects.

- Index based access.

- Fail-fast

- Vectors are synchronized which gives it an advantage over ArrayList as compared to multithreaded programs as there are risks of data corruption.

- Vectors have some legacy functions which can be implemented only on vectors and not on ArrayLists.

- Vectors can store any type of objects, whereas an array can store only homogeneous values.

- ArrayList is faster, since it is non-synchronized, while vector operations give slower performance since they are synchronized (thread-safe).

- ArrayList increments 50% of the current array size if the number of elements exceeds its capacity, while vector increments 100% – essentially doubling the current array size.

- Vector can use both Enumeration and Iterator for traversing over elements of vector while ArrayList can only use Iterator for traversing.

### Stack

- Located In java util package.

- Represents a last-in-first-out (LIFO) stack of objects.

- Extends vector.

- Provides different operations such as push, pop, search, etc.

- manage the data in a Last In First Out(LIFO) method which is not possible with Linked list and array.

- Creating too many objects on the stack can increase the risk of stack overflow.

- Iterate Elements
  - Using iterator() Method
  - Using forEach() Method
  - Using listIterator() Method

---

> ## Set Interface

- Located In Java utils package.

- Extends Collection

- A collection that contains no duplicate elements.

- It is an interface which implements the mathematical set.

- This interface contains the methods inherited from the Collection interface and adds a feature which restricts the insertion of the duplicate elements.

- Set doesn’t retain the insertion order

* Commonly used Methods

  - boolean add(E e) throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException

  - There is also methods like size, isEmpty, contains, toArray,remove, containsAll, addAll, retainAll, removeAll and clear.

### SortedSet

- Located in java util package.

- Extends Set Interface.

- A Set that further provides a total ordering on its elements.

- The set's iterator will traverse the set in ascending element order.

- All elements inserted into a sorted set must implement the Comparable interface (or be accepted by the specified comparator).

* Commonly used Methods

  - Comparator<? super E> comparator()

  - SortedSet<E> subSet(E fromElement, E toElement) throws ClassCastException, NullPointerException, IllegalArgumentException

  - SortedSet<E> headSet(E toElement) throws ClassCastException, NullPointerException, IllegalArgumentException

  - SortedSet<E> tailSet(E fromElement) throws ClassCastException, NullPointerException, IllegalArgumentException

  - E first()

  - E last()

### HashSet

- Located in java util package.

- Extends AbstractSet and implements Set, Cloneable, Serializable.

- Backed by a hash table which is actually a HashMap instance.

- No guarantee is made as to the iteration order of the set which means that the class does not guarantee the constant order of elements over time.

- This class offers constant time performance for the basic operations add, remove, contains, and size.

- This implementation is not synchronized.

- Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted based on their hash code.

- Returns Fail-fast iterator.

* In Custom Object We have to define equal to and hash code method so hash set can identify the different object, else we can add same property which have same value.

### LinkedHashSet

- Located in java util package.

- Extends HashSet and implements Set, Cloneable, Serializable.

- Hash table and linked list implementation of the Set interface with predictable iteration order

- This implementation differs from HashSet in that it maintains a doubly-linked list running through all of its entries.

- This linked list defines the iteration ordering, which is the order in which elements were inserted into the set.

- This class offers constant time performance for the basic operations add, remove, contains, and size.

- A linked hash set has two parameters that affect its performance:

  - initial capacity
  - load factor

- This implementation is not synchronized.

- The iterators returned by this class's method are fail-fast.

### NavigableSet

- Located In java util package.

- Extends SortedSet.

- A SortedSet extended with navigation methods reporting closest matches for given search targets.

- Methods lower, floor, ceiling, higher return elements respectively less than, less than or equal, greater than or equal, and greater than a given element, returning null if there is no such element.

- A NavigableSet may be accessed and traversed in either ascending or descending order.

- The performance of ascending operations and views is likely to be faster than that of descending ones.

- This interface additionally defines methods pollFirst and pollLast that return and remove the lowest and highest element, if one exists, else returning null.

- Methods subSet, headSet, and tailSet differ from the like-named SortedSet methods in accepting additional arguments describing whether lower and upper bounds are inclusive versus exclusive.

### TreeSet

- Located In Java Util package.

- Extends AbstractSet and implements NavigableSet, Cloneable, Serializable.

- A NavigableSet implementation based on a TreeMap.

- The elements are ordered.

- This implementation provides guaranteed log(n) time cost for the basic operations like add, remove, contains.

- TreeSet class access and retrieval times are quiet fast.

- This implementation is not synchronized.

* The iterators returned by this class's method are fail-fast.

- ceiling method: It returns the equal or closest greatest element of the specified element from the set, or null there is no such element.

- floor method: It returns the equal or closest least element of the specified element from the set, or null there is no such element.

- Commonly used Methods

  - E ceiling(E e)

  - E floor(E e)

  \*There is also methods like Iterator descendingIterator(), NavigableSet descendingSet(), E higher(E e), E lower(E e),SortedSet tailSet(E fromElement and clear.

> ## Queue Interface

- Located in java util package.

- Extends Collection Interface.

- A collection designed for holding elements prior to processing.

- Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations.

- Each of these methods exists in two forms:

  - one throws an exception if the operation fails
  - the other returns a special value either null or false depending on the operation.

- Queues typically, but do not necessarily, order elements in a FIFO (first-in-first-out) manner. Among the exceptions are priority queues, which order elements according to a supplied comparator, or the elements' natural ordering, and LIFO queues/stack which order the elements LIFO (last-in-first-out).

- The offer method inserts an element if possible, otherwise returning false. This differs from the add method which can fail to add an element only by throwing an unchecked exception.

- The remove and poll methods remove and return the head of the queue, Exactly which element is removed from the queue is a function of the queue's ordering policy, which differs from implementation to implementation.

- The remove and poll method differ only in their behavior when the queue is empty remove method throws an exception, while the poll method returns null.

* Commonly used Methods

  - boolean add(E e) throws IllegalStateException ,ClassCastException, NullPointerException, IllegalArgumentException.

  - boolean offer(E e) throws ClassCastException, NullPointerException, IllegalArgumentException.

  - E remove() throws NoSuchElementException

  - E poll()

  - E element() throws NoSuchElementException.

  - E peek()

### De-Queue

- Located in java util package.

- Extends Queue.

- A linear collection that supports element insertion and removal at both ends.

- The name deque is short for "double ended queue" and is usually pronounced "deck".

- Most Deque implementations place no fixed limits on the number of elements they may contain, but this interface supports capacity-restricted deques as well as those with no fixed size limit.

- This interface defines methods to access the elements at both ends of the deque.

- peek method works equally well when a deque is used as a queue or a stack; in either case, elements are drawn from the beginning of the deque.

- Unlike the List interface, this interface does not provide support for indexed access to elements.

- Commonly used Methods

|         | Throws exception | Special value |
| ------- | ---------------- | ------------- |
| Insert  | addFirst(e)      | offerFirst(e) |
| Remove  | RemoveFirst()    | pollFirst()   |
| Examine | getFirst()       | peekFirst()   |
| Insert  | addLast(e)       | offerLast(e)  |
| Remove  | removeLast()     | pollLast()    |
| Examine | getLast()        | peekLast()    |

- Queue Methods And Deque Methods

| Queue Method | Equivalent Deque Method |
| ------------ | ----------------------- |
| add(e)       | addLast(e)              |
| offer(e)     | offerLast(e)            |
| remove()     | removeFirst()           |
| poll()       | pollFirst()             |
| element()    | getFirst()              |
| peek()       | peekFirst()             |

- Stack And Deque Methods

| Stack Method | Equivalent Deque Method |
| ------------ | ----------------------- |
| push(e)      | addFirst(e)             |
| pop()        | removeFirst()           |
| peek()       | peekFirst()             |

### PriorityQueue

- Located In java util package.

- Extends AbstractQueue and implement Serializable.

- An unbounded priority queue based on a priority heap.

- The elements of the priority queue are ordered according to their Comparable or natural ordering.

- A priority queue does not permit null elements.

- The head of this queue is the least element with respect to the specified ordering.

- The queue retrieval operations poll, remove, peek, and element access the element at the head of the queue.

- The Iterator provided in method iterator() is not guaranteed to traverse the elements of the priority queue in any particular order.

- If you need ordered traversal, consider using Arrays.sort(pq.toArray()).

- Note that this implementation is not synchronized.

- This implementation provides O(log(n)) time for the enqueuing and dequeuing methods (offer, poll, remove() and add);

- Linear time for the remove(Object) and contains(Object) methods;

- Constant time for the retrieval methods (peek, element, and size).

* Use for min heap and max heap implementation.

### ArrayDeque

- Located in java util package.

- Extends AbstractCollection and implements Deque, Cloneable, Serializable.

- Resizable-array implementation of the Deque interface.

- Not thread-safe.

- This class is likely to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue.

- Most ArrayDeque operations run in amortized constant time.Exceptions include remove, removeFirstOccurrence, removeLastOccurrence, contains, iterator.remove(), and the bulk operations, all of which run in linear time.

- The iterators returned by this class's iterator method are fail-fast.

- Commonly used Methods
  - public boolean offerFirst(E e)
  - public boolean offerLast(E e)
  - public E pollFirst()
  - public E pollLast()

> ## Map Interface

- Located In java util package.

- An object that maps keys to values.

- A map cannot contain duplicate keys.

- The Map interface provides three collection views

  - set of keys
  - set of values
  - set of key-value mappings

- Some map implementations, like the TreeMap class, make specific guarantees as to their order; others, like the HashMap class, do not.

- Commonly used Methods

  - boolean containsKey(Object key)

  - boolean containsValue(Object value)

  - V put(K key, V value)

  - Set<K> keySet()

  - Set<Map.Entry<K, V>> entrySet()

  - default V getOrDefault(Object key, V defaultValue)

  - default V putIfAbsent(K key, V value)

  - default boolean replace(K key, V oldValue, V newValue)

  - default V computeIfAbsent(K key,Function<? super K, ? extends V> mappingFunction)

  - default V computeIfPresent(K key,BiFunction<? super K, ? super V, ? extends V> remappingFunction)

### SortedMap

- Located in java util package.

- Extends Map Interface.

- A Map that further provides a total ordering on its keys.

- The map is ordered according to the natural ordering of its keys, or by a Comparator typically provided at sorted map creation time.

- Several additional operations are provided to take advantage of the ordering. (This interface is the map analogue of SortedSet.)

- All keys inserted into a sorted map must implement the Comparable interface (or be accepted by the specified comparator).

- Several methods return submaps with restricted key ranges. Such ranges are half-open, that is, they include their low endpoint but not their high endpoint (where applicable).

### HashMap

- Located in java util package.

- Extends AbstractMap and implements Map, Cloneable, Serializable.

- Hash table based implementation of the Map interface.

- This implementation provides all of the optional map operations, and permits null values and the null key. (The HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls).

- This implementation provides constant-time performance for the basic operations (get and put), assuming the hash function disperses the elements properly among the buckets.

- An instance of HashMap has two parameters that affect its performance: initial capacity and load factor.

- If many mappings are to be stored in a HashMap instance, creating it with a sufficiently large capacity will allow the mappings to be stored more efficiently than letting it perform automatic rehashing as needed to grow the table.

- This implementation is not synchronized.

- The iterators returned by all of this class's "collection view methods" are fail-fast.

* Override the duplicate value.

* Iterate Hashmap
  - We have to use map entry set with for loop to iterate hashmap.

### HashTable

- Located in java util package.

- Extends Dictionary and implements Map, Cloneable, Serializable.

- This class implements a hash table, which maps keys to values. Any non-null object can be used as a key or as a value.

- To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the hashCode method and the equals method.

- An instance of Hashtable has two parameters that affect its performance: initial capacity and load factor.

- The capacity is the number of buckets in the hash table, and the initial capacity is simply the capacity at the time the hash table is created.

- Note that the hash table is open: in the case of a "hash collision", a single bucket stores multiple entries, which must be searched sequentially.

- The load factor is a measure of how full the hash table is allowed to get before its capacity is automatically increased.

- The default load factor (.75) offers a good tradeoff between time and space costs. Higher values decrease the space overhead but increase the time cost to look up an entry (which is reflected in most Hashtable operations, including get and put).

- The initial capacity controls a tradeoff between wasted space and the need for rehash operations, which are time-consuming. No rehash operations will ever occur if the initial capacity is greater than the maximum number of entries the Hashtable will contain divided by its load factor. However, setting the initial capacity too high can waste space.

- The iterators returned by the iterator method of the collections returned by all of this class's "collection view methods" are fail-fast.

- If a thread-safe highly-concurrent implementation is desired, then it is recommended to use ConcurrentHashMap in place of Hashtable.

### TreeMap

- Located in java util package.

- Extends AbstractMap and implements NavigableMap, Cloneable, Serializable

- A Red-Black tree based NavigableMap implementation.

- The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used.

- This implementation provides guaranteed log(n) time cost for the containsKey, get, put and remove operations. Algorithms are adaptations of those in Cormen, Leiserson, and Rivest's Introduction to Algorithms.

- This implementation is not synchronized.

- The iterators returned by the iterator method of the collections returned by all of this class's "collection view methods" are fail-fast.

- All Map.Entry pairs returned by methods in this class and its views represent snapshots of mappings at the time they were produced. They do not support the Entry.setValue method. (Note however that it is possible to change mappings in the associated map using put).

### LinkedHashMap

- Located In java util package.

- Extends HashMap and implement Map.

- Hash table and linked list implementation of the Map interface, with predictable iteration order.

- This implementation differs from HashMap in that it maintains a doubly-linked list running through all of its entries.

- This linked list defines the iteration ordering, which is normally the order in which keys were inserted into the map (insertion-order).

- It can be used to produce a copy of a map that has the same order as the original, regardless of the original map's implementation.

- This technique is particularly useful if a module takes a map on input, copies it, and later returns results whose order is determined by that of the copy.

- This kind of map is well-suited to building LRU caches.

- Invoking the put, putIfAbsent, get, getOrDefault, compute, computeIfAbsent, computeIfPresent, or merge methods results in an access to the corresponding entry (assuming it exists after the invocation completes).

- The replace methods only result in an access of the entry if the value is replaced.

- The putAll method generates one entry access for each mapping in the specified map, in the order that key-value mappings are provided by the specified map's entry set iterator. No other methods generate entry accesses.

- The removeEldestEntry(Map.Entry) method may be overridden to impose a policy for removing stale mappings automatically when new mappings are added to the map.

- This class provides all of the optional Map operations, and permits null elements.

- Like HashMap, it provides constant-time performance for the basic operations (add, contains and remove), assuming the hash function disperses elements properly among the buckets.

- Performance is likely to be just slightly below that of HashMap, due to the added expense of maintaining the linked list, with one exception: Iteration over the collection-views of a LinkedHashMap requires time proportional to the size of the map, regardless of its capacity. Iteration over a HashMap is likely to be more expensive, requiring time proportional to its capacity.

- A linked hash map has two parameters that affect its performance: initial capacity and load factor.

- This implementation is not synchronized.

- The iterators returned by the iterator method of the collections returned by all of this class's collection view methods are fail-fast.

- The spliterators returned by the spliterator method of the collections returned by all of this class's collection view methods are late-binding, fail-fast, and additionally report Spliterator.ORDERED.
