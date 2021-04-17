# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#lambdas)

## Generics
- It allows variables and methods to operate on objects of various types while providing compile-time type safety.
- Conventions:
  * T (type)
  * V (value)
  * K (key)  
  * a letter o a word  
- Generics can be used with both classes and interfaces.

````java
public class Some<T> {
    private T value;
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
}

Some<Product> some = new Some<>();
some.setValue(new Product("Tea",1.99));
Product product = some.getValue();

````

## Lambdas
- Lambda expressions are enabled by **functional interfaces**.
- A **function interface**, it's an interface that has exactly one abstract method.
- The remaining methods, if any, they are either default, static, or private.

````java
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        Collections.sort(names, (o1, o2) -> o1.length() - o2.length());
````

````java
@FunctionalInterface // this is optional
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

### Method references
- Reference method is **semantically identical** to the method that lambda expression is implementing.
- Semantically identical means it has the same return type, and the same parameters type, number and order.
````java
public class TextFilter{
    public static boolean removeA(String s){
        return s.equals("remove A");
    }
    public int sortText(String s1, String s2){
      return s1.compareTo(s2);
    }
}

public class Main(){
    public static void main(String[] args){
        TextFilter filter = new TextFilter();
        List<String> list = new ArrayList<>();
        ...
    }
}
````

- \<Class\>::\<staticMethod\> - reference a static method
````java
  list.removeIf(s -> TextFilter.removeA(s));

  list.removeIf(TextFilter::removeA);
````
- \<object\>::\<instanceMethod\> - reference an instance method of a particular object
````java
  Collections.sort(list, (s1,s2) -> filter.sortText(s1,s2));

  Collections.sort(list, filter::sortText);
````  
- \<Class\>::\<instanceMethod\> - reference an instance method of an arbitrary object of a particular type
````java
   Collections.sort(list, (s1,s2) -> s1.compareToIgnoreCase(s2));

   Collections.sort(list, String::compareToIgnoreCase);
````  
- \<Class\>::new - reference a constructor
````java
 
````

### Comparator interface
````java
Comparator<Product> sortNames = (p1,p2) -> p1.getName().compareTo(p2.getName());
Collections.sort(menu, Comparator.nullsFirst(sortNames));
````

### Predicate interface
````java
Predicate<Product> foodFilter = (p) -> p instanceof Food;
menu.removeIf(foodFilter.negate());
````