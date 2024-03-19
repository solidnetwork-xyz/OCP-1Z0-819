# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#streams)

## Streams
- Stream is an immutable flow of elements
- Streams is pipelines of data.
- Collections are converted to stream, standard or parallel.
- Arrays are converted to stream using **Arrays.stream(array)**  
- Stream methods are chained together.
- Stream methods take lambda expressions as arguments.

````java
Stream.generate(<Supplier>)
      .filter(<Predicate>)
      .peek(<Consumer>)
      .map(<Function>/<UnaryOperator>)
      .forEach(<Consumer>);
````

````java
List<Product> products = new ArrayList();

// loop
for(Product p : products){
    if(p.getPrice()>10){
        p.setDiscount(0.2);
    }
}

// Stream
products
        .streams()
        .parallel()
        .filter(p->p.getPrice()>10)
        .forEach(p->p.setDiscount(0.2));          

````

````java
        List<String> names = List.of("Barclay", "Barry", "Bert", "Bot", "Bart");

        names.stream()                                                      // or .parallelStream()
                .filter(name -> name.contains("t"))                         // Predicate
                .filter(name -> name.contains("a") || name.contains("e"))  // Predicate
                .forEach(name -> System.out.println(name));                 // Consumer
````

### Pipeline traversal is lazy
- Intermediate actions are deferred until stream in traversed by the terminal operation
- The chain of activities could be fused into a single pass on data
- Stream processing ending as soon as the result is determined; remaining stream data can be ignored

### Intermediate operations
All intermediate operations return **Stream**

- filter
- peek
- map
- flatmap

### Terminal operations return Optional
- findFirst 
- findAny
- max
- min

#### Optional
- T get() **return T**
- T orElse(T t) **return T**
- boolean isPresent() **return boolean**

### Terminal operations
- forEach
- anyMatch, allMatch, noneMatch **return boolean**
- count **return long**

### Stream API interfaces
- BaseStream
  - Stream
  - DoubleStream  
  - IntStream
  - LongStream

#### BaseStream
- sequential
- parallel

#### Stream
````java
Stream.of(new Food(),new Drink()).forEach(p->p.setPrice(1));
````

#### DoubleStream
````java

````

#### IntStream
````java
IntStream.generate(()->(int)(Math.random()*10)).takeWhile(n->n!=3).sum();
````

#### LongStream
````java

````
