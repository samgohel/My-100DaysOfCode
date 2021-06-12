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

  * There is also methods like addAll, addAll with index number, removeAll, clear, equals, hashCode, get, index based add, index based remove, indexOf, and parallelStream.

  - List<E> subList(int fromIndex, int toIndex) throw IndexOutOfBoundsException.

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

- ensureCapacity increase the capacity of an ArrayList instance before adding a large number of elements.

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

### LinkedList

### Vector

### Stack

---

> ## Set Interface

- Duplicate elements not allowed.

1. ### SortedSet
1. ### HashSet
   - In Custom Object We have to define equal to and hash code method so hash set can identify the different object, else we can add same property which have same value.

- Order Not Preserved
- Uses hashing mechanism for store element.

1. ### LinkedHashSet
   - Order preserved.

-

1. ### TreeSet

- Sorted Elements.

1. ### NavigableSet

> ## Queue Interface

- FIrst In First Out (FIFO) DS.

1. ### De-Queue
1. ### PriorityQueue

- We can assign priority to element for perform operation.
- Use for min heap and max heap implementation.

1. ### ArrayDeque

- Common operation Allowed
  - offerFirst
  - offerLast
  - offer
  - peekFirst
  - peekLast
  - pollLast
  - pollFirst

1. ### LinkedList
   - Common Operation Allowed
     - Offer
     - Poll
     - Peek
     - Add

> ## Map Interface

- Stores Key value pair.

1. ### SortedMap
1. ### HashMap

- override the duplicate value.
- Common Operation Allowed
  - put
  - put if absent
  - contains key
  - contains value
- Iterate Hashmap
  - We have to use map entry set with for loop to iterate hashmap.

1. ### HashTable
1. ### TreeMap
1. ### LinkedHashMap
