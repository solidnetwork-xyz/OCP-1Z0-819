# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#lambdas)

## Lambdas
- Lambda expressions are enabled by **functional interfaces**.
- A **function interface**, it's an interface that has exactly one abstract method.
- The remaining methods, if any, they are either default, static, or private.

````java
public interface FuncInterface{
    double abstractMethod(int x);
}

public class TestClass {
    FuncInterface lambda = x -> 2.0 * x;
}
````

### Built-in functional interfaces
| Lambda Type     | Abstract Method | Example |
| ----------- | ----------- |-------|
| Function\<T,R\> | R apply(T t); | Function\<Integer,Double\> lambda = x -> 2.0*x; |
| UnaryOperator\<T\> | T apply(T t); | UnaryOperator\<Integer\> lambda = x -> 2*x; |
| Predicate\<T\> | boolean test(T t); | Predicate\<Integer\> lambda = x -> x==10; |
| Consumer\<T\> | void accept(T t); | Consumer\<Integer\> lambda = x -> System.out.println(x); |
| Supplier\<T\> | T get(); | Supplier\<String\> lambda = () -> "Canada"; |
| Runnable | void run(); | Runnable lambda = () -> System.out.println("Run"); |

### Parentheses
- Parentheses are only optional with a single implicit parameter.

````java
Consumer<String> lambda = x -> System.out.println(x);

Consumer<String> lambda = (x) -> System.out.println(x);

Consumer<String> lambda = (String x) -> System.out.println(x);

BiConsumer<String, String> lambda = (x,y) -> System.out.println(x+y); 
````

### Parameter don'ts
````java
(Item x, y) -> x.process(y); // You could never mix implicitly and explicitly typed lambda parameters
        
Item x -> x.toString(); // You cannot omit parenthesis for single explicitly typed lambda parameter
````

### Braces
- braces on lambda expressions are optional if a lambda expression contains only one statement.
- Enclose multiple statements within curly braces.
- Include a semicolon after each statement and at the end of the lambda expression.
- Include a return statement for expressions that return values.

````java
Consumer<String> lambda = x -> {
    x = x + "Prottonne";
    System.out.println(x);
};

Supplier<Double> lambda = () -> {return Math.PI;};
        
````

### Shorthand
````java
Function<String, String> lambda = x -> x.toUpperCase();

Function<String, String> lambda = String::toUpperCase;
````

