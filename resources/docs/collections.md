# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#collections)

## Collection interfaces and implementation classes
- Iterable\<T\>
  - Collection\<E\>
    - List\<E\>
      - ArrayList\<E\> (c)
    - Set\<E\>
      - HashSet\<E\> (c)
      - SortedSet\<E\>
        - TreeSet\<E\> (c)
    - Queue\<E\>  
      - Deque\<E\>
        - ArrayDeque\<E\> (c)
- Map\<K,V\>
  - HashMap\<K,V\> (c)

### Iterable\<T\>
- top-level interfaces forEach capability

### Collection\<E\>
- add
- remove
- size
- isEmpty 
- contains 
- toArray 
- stream 

### List\<E\> and ArrayList\<E\>
- list of elements indexed by int
- List\<E\> List.of(\<E\> ...) // read-only List, but element could be modified
- add // add(n,\<E\>) push elements if element exists in n position, you cannot add beyond the top of the list
- set // set(n,\<E\>) update position n with new element
- get
- indexOf // int indexOf(\<E\>) first position of element
- you could add null elements

### Set\<E\> and HashSet\<E\>
- set of unique elements
- Set\<E\> Set.of(\<E\> ...) // read-only Set, but element could be modified
- add // boolean add(\<E\>) // if element exists it's ignored and return false
- remove // return true or false if element was removed
- you could add null elements

### SortedSet\<E\> and TreeSet\<E\>
- extends **Set** to add ordering ability

### Deque\<E\> (pronunciation: dek) and ArrayDeque\<E\>
- a double-ended queue
- FIFO
- LIFO
- null values are not allowed
- if deque is empty, poll and peek operations return **null**  
- offerFirst(E e); // insert element at the head of the deque
- offerLast(E e); // insert element at the tail of the deque  
- T pollFirst(); // get and remove element at the head of the deque
- T pollLast(); // get and remove element at the tail of the deque
- T peekFirst(); // get element at the head of the deque
- T peekLast(); // get element at the tail of the deque

### Map\<K,V\> and HashMap\<K,V\>
- a **Set** of unique keys and a **Collection** of values
- Map\<K,V\> Map.of(K k1, V v1, ...) // read-only Map, up to 10 entries but element could be modified
- Map\<K,V\> Map.ofEntries(Map.Entry<K,V>... entries) // read-only Map, but element could be modified
- containsKey(K)
- containsValue(V)
- get
- put // insert or update (when using an existing key, and return the previous value)
- remove
- putIfAbsent // insert if not exist

### Concurrency
You can follow one of the following strategies:
- thread-safe are guaranteed when: collection is immutable and its elements are immutable too.
- Set\<E\> Collections.unmodifiable\[Set|Map|List\](set); // fast, but read-only
- Map\<K,V\> Collections.synchronized\[Set|Map|List\](map); // slow and unscalable
- List\<E\> new CopyOnWriteArray\[Set|List\]<>(list); // fast, but consumes memory. It duplicates collections (not elements) and then merges them

## Collections class
- sort // follow an order if implements **Comparable** interface or **Comparator** as parameter
- reverse
- shuffle // randomly reorders collection
- binarySearch
- fill(collection,E) // fill all the collection with E in each position