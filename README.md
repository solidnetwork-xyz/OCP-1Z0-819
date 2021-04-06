# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices

## Notes:
### Packages:
Class doesn't need package

### Access Modifiers
- **protected**: package, subclasses
- **no-modifier**: package

### Class
#### abstract class
- abstract methods only inside abstract class
- abstract class can implement interface class, and the abstract methods be resolved by a concrete class
````java
public interface TestInterface{
    double calculateTax();
}

public abstract class TestClass implements TestInterface{
    public double calculateTax(double tax){} // this is not from TestInterface
}
````

#### Interfaces
- Instance methods are by default public and abstract
- They can contain concrete methods only if they are either **default** or **private** or **static**
- They can contain constants but not variables. By default, constants are **static** and **final**
- **default** keyword is not a modifier
- [public][abstract|default|static] | [private][static] **method**.
- [static][final] **field**.

````java
public interface <InterfaceName> [extends <OtherInterface>]{
    <constants>
    <abstract methods>
    <default methods>
    <private methods>
    <static methods>    
}

public interface IService {
    int MAX_PRICE = 15; // a constant, static and final

    void call(); // this is public and abstract method

    private String concreteMethod() { // this is a private concrete method
        return "I can't believe this";
    }

    default String staticMethod() { // this is a public default method
        return concreteMethod();
    }

    static int getMaxPrice() { // this is a static
        return MAX_PRICE;
    }


}
````
#### Inheritance Rules of default methods
- a superclass (extended class) method takes priority over an interface **default** method.
- a subtype interface's default method takes priority over a super-type interface's default method of that subtype. 
- two equal subtypes interface's default method are going to be treated as abstract


##### Comparable interface
- We need to implement **int compareTo(T other)**
- Returns:
  - **-1**: this < other 
  - **0**: this == other
  - **1**: this > other 

````java
public class MyClass implements Comparable<MyClass> {

    private int id;

    public MyClass(int aId) {
        this.id = aId;
    }

    @Override
    public int compareTo(MyClass other) {
        return (other.id == id) ? 0 : (other.id < id) ? 1 : -1;
    }
}
````

#### main class
```java
public static void main(String[] args){}
```
Non-static field 'declared out of main' cannot be referenced from a static context

#### method
- The signature of a method is: a name +  parameter types
- No two method with the same signature can exist in a class, even if they have different return types

````java
public boolean fit(String sizeToCompare){}
public String fit(String otherSize){} // Method invocation is resolved based on a name +  parameter types
````
        
### Types

#### int
````java
int someInt = 10_000_000;
````

ranges: +/- **2.1B**


#### String
Uninitialized has a default value **null**

#### double
````java
double someDouble = 32.16;
double someDouble = 32.16d;
double someDouble = 32.16D;
double someDouble = 2.1E12;
double someDouble = 75; //Becomes 75.0
double someDouble = .3;
double someDouble = 4.0f;
````

### variables

#### Names
Names must not start with **_**, numeric character, or include a white space. 

#### declaration
````java
String name, city;
String country ="USA", state="CO";
````

##### Scope
Variables can have a scope of specific block of code
````java
if(price > 20){
    double discount = 0.5;
    price -= fee *  discount;
}
````

#### Local-variable Type Inference
````java
    var outputStream = new ByteArrayOutputStream();
    
    UnaryOperator<Integer> unaOp2 = (var x) -> x * 7;
    
    var x = 30;
    
    for(var item : items){}
    
    for(var i=0; i<10; i++){}
    
    var var = 10;
    
````
Where can it **not** be used?
````java
var price; // declarations without an initial value

var price = null; // initialization with a null value

var price = 9.95, tax = 0.05; // compound declarations

var prices = {9.95, 5, 3.50}; // Array initializers

public var price; // fields of a class

public void setPrice(var price){} // parameters of a method

public var getPrice(){} // method return types

(var x, y) -> x.process(y); // You could never mix implicitly and explicitly typed lambda parameters

(var x, int y) -> x.process(y);
        
var x -> x.toString(); // You cannot omit parenthesis for single explicitly typed lambda parameter

````
be careful with **interfaces**
````java
var list = new ArrayList<String>(); // inferred as ArrayList<String>
var itemQueue = new PriorityQueue<>(); // inferred as PriorityQueue<Object>
````
**numbers** usually are going to be inferred as **int** or **double**

### Operators
#### Operator precedence
- From left to right
- Parentheses
- ++/--
- Multiplication and division
- Addition and subtraction 


### Flow Control
#### switch
condition doesn't need to be final

````java
String codition = "Used";
switch(condition){
    case "Used": 
        discount = price * 0.1;
        break;
    default: 
        discount = price;
}
````

#### loops

##### For statement

````java
    int i = 0;
        for (; ; ) {
            if (i >= 5)
                break;

            System.out.println(i);
            i++;
        }
````


### Arrays
#### Initialization
````java
String[] aString = {"St1","St2","St3"};
int[] aInt = {1,2,3};
````

#### Declaration
You instantiate **Arrays** when you use new type[value], you don't instantiate a type
````java
String[] aString2 = new String[3]; // an array of 3 Strings
int[] aInt2 = new int[16]; // an array of 16 ints
Recyclable[] rubbish = new Recyclable[3]; // we have an array of objects that implement the Recyclable interface
Toy[] myToys = new Toy[3]; // an array of 3 abstract Toys
````

### Objects in Memory
- **Variables** are stored in the **Stack**
- **Objects** are stored in the **Heap**
- **Object references** are pointers and variables, they are store in the **Stack**

### Exceptions
#### Hierarchy
- Throwable **(checked)**
    - Exception **(checked)** / Error **(unchecked)**
        - RuntimeException **(unchecked)**

#### Flow
After an exception is handled, the execution continues after the last catch handler
````java
try{
    
    }catch(Exception e){
    System.out.println("exception is handled here");
}
System.out.println("execution continues here");
````

### Lambdas
parameter don'ts
````java
(Item x, y) -> x.process(y); // You could never mix implicitly and explicitly typed lambda parameters
Item x -> x.toString(); // You cannot omit parenthesis for single explicitly typed lambda parameter
````