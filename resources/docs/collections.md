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
    - Deque\<E\>
      - ArrayDeque\<E\> (c)
- Map\<K,V\>
  - HashMap\<K,V\> (c)

### Collection interfaces
#### Iterable\<T\>
- top-level interfaces forEach capability

#### Collection\<E\>
- add
- remove

#### List\<E\>
- list of elements indexed by int

#### Set\<E\>
- set of unique elements

#### SortedSet\<E\>
- extends **Set** to add ordering ability

#### Deque\<E\> (pronunciation: dek)
- a double-ended queue
- FIFO
- LIFO

#### Map\<K,V\>
- a **Set** of unique keys and a **Collection** of values
  
### Collection classes

#### ArrayList\<E\>
- implements **List**

#### HashSet\<E\>
- implements **Set**

#### TreeSet\<E\>
- implements **SortedSet**

#### ArrayDeque\<E\>
- implements **Deque**

#### HashMap\<K,V\>
- implements **Map**