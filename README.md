# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices

## Notes:
### Packages:
Class doesn't need package

### Access Modifiers
- **protected**: package, subclasses
- **default**: package

### Class
#### abstract class
abstract methods only inside abstract class

#### Interfaces
- Instance methods are by default public and abstract
- They can contain concrete methods only if they are either **default**, **private** or **static**
- They can contain constants but not variables

````java
public interface <InterfaceName>{
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

    default String staticMethod() { // this is a default method
        return concreteMethod();
    }

    static int getMaxPrice() { // this is a static
        return MAX_PRICE;
    }


}
````

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
