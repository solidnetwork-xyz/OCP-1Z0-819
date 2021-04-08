# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#streams)

## Streams
- Streams are pipelines of data.
- Collections are converted to streams, standard or parallel.
- Stream methods are chained together.
- Stream methods take lambda expressions as arguments.

````java
        List<String> names = List.of("Barclay", "Barry", "Bert", "Bot", "Bart");

        names.stream()                                                      // or .parallelStream()
                .filter(name -> name.contains("t"))                         // Predicate
                .filter(name -> name.contains("a") || name.contains("e"))  // Predicate
                .forEach(name -> System.out.println(name));                 // Consumer
````

### Intermediate operations
- filter
- peek
- map
- flatmap

### Terminal operations
- forEach
- findFirst, findAny, max, min **return Optional**
- Optional.get() **return the data**
- Optional.orElse(T t) **return T**
- anyMatch, allMatch, noneMatch **return boolean**
- count **return long**

