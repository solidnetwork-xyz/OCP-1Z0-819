# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#class)

## Class
- if object is null, the **instanceof** operator returns false.
- if super class has a constructor with parameters, and you extend it, you must call super(parameters)

### Class and Object Initialization
1. All code of class (static), only once per class
2. Each object instance and its parents

### Abstract classes
- Abstract methods only inside abstract class.
- Abstract class can implement interface class, and the abstract methods must be resolved by a concrete class.
- when you add **abstract** keyword you prevent direct instance 
````java
public interface TestInterface{
    double calculateTax();
}

public abstract class TestClass implements TestInterface{
    public double calculateTax(double tax){} // this is not from TestInterface

    public abstract void abstractFromAbstract();
}

public abstract class SecondAbstractTestClass extends TestClass {
  // nothing is mandatory here
}

public class TestConcrete extends TestClass {
  @Override
  public double calculateTax() {
    return 16;
  }

  @Override
  public void abstractFromAbstract() {
    System.out.println("This is mandatory");
  }
}


````

### Final class and methods
- Class cannot extend a class that is marked with the **final** keyword.
- The subclass cannot override a superclass method that is marked with the **final** keyword. 


### Interfaces
- Interface methods are by default **public** and **abstract**.
- Methods are concrete unless there is an **abstract** keyword.
- By default, constants are **static** and **final**. They can contain constants but not variables.
- **default** keyword is not a modifier.
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

public interface IService extends ISuperService {
    int MY_STATIC_CONSTANT = 15; // a constant, static and final

    void myAbstractMethod(); // this is public and abstract method

    private String myConcreteMethod() { // this is a private concrete method
        return "I would be call by default method";
    }

    default String myDefaultMethod() { // this is a public default method
        return myConcreteMethod();
    }

    static int myStaticMethod() { // this is a static
        return MY_STATIC_CONSTANT;
    }

    private static String myPrivateStaticMethod() {
        return "all static are concrete";
    }
}
````
### Inheritance rules of default methods
- a superclass (extended class) method takes priority over an interface **default method**.
- a subtype interface's **default method** takes priority over a super-type interface's **default method** of that subtype.
- two equal subtypes interface's **default method** are going to be treated as abstract.
- A class must override default interface method only if conflicts with another default method.
- if a class **implements** method a() from an interface, and at the same time **extends** method a() from a concrete class, the last one (contrete) resolve the interface abstraction
- public **default** method in an interface is **public** in the implementation class

### Comparable interface
- We need to implement **int compareTo(T other)**
- Returns:
    - **0**: this == other
    - **positive**: this > other
    - **negative**: this < other

````java
public interface Comparable<T>{
    int compareTo(T o);
}

public class MyClass implements Comparable<MyClass> {

    private int id;

    public MyClass(int anId) {
        this.id = anId;
    }

    @Override
    public int compareTo(MyClass other) {
        return (id == other.id) ? 0 : (id > other.id) ? 1 : -1;
    }
}
````

### Comparator interface
- We need to implement **int compare(T o1, T o2)**
- Returns:
  - **0**: this == other
  - **positive**: this > other
  - **negative**: this < other

````java
import java.util.Arrays;

public interface Comparator<T> {
  int compare(T o1, T o2);
}

public class MyClassSorter implements Comparator<MyClass> {

  @Override
  public int compare(MyClass c1, MyClass c2) {
    return (c1.getId() == c2.getId()) ? 0 : (c1.getId() > c2.getId()) ? 1 : -1;
  }
}

public class MyClass {

  private int id;

  public MyClass(int anId) {
    this.id = anId;
  }
}

public class Main {
  public static void main(String[] args) {
    MyClass[] classes = {new MyClass(5), new MyClass(2)};
    Arrays.sort(classes, new MyClassSorter());
  }
}

````

### Main class
```java
public static void main(String[] args){}
```
Non-static field 'declared out of main' cannot be referenced from a static context.

### Object class
- public native int **hashCode()**
- public boolean **equals(Object obj)**
- protected native Object **clone()**
- public String **toString()**

### Methods
- The signature of a method is: a name +  parameter types.
- No two method with the same signature can exist in a class, even if they have different return types.

````java
public boolean fit(String sizeToCompare){}

public String fit(String otherSize){} // Method invocation is resolved based on a name +  parameter types
````

### Enumerations
* Enum values are implicitly:
  * public
  * static
  * final
  
````java
public enum Planet {
    MERCURY(0.39), VENUS(), EARTH;
    private double distanceFromSunAU = 1.0;
    private Planet(double distance){
        distanceFromSunAU = distance;
    }
    private Planet(){
        distanceFromSunAU = 5.0;
    }
    public double getDistace(){
        return distanceFromSunAU;
    }
}
````


### Nested classes
- class defined inside other class
- \[Nested-Static-Class|Nested-Member-Class\]\[public|protected|default\] - can be accessed externally
- \[Nested-Static-Class|Nested-Member-Class\]private - can be accessed only inside their outer class

#### Static
- associated with the static context of the outer class
- can access private variables and methods of the outer class
- can only access static variables and methods of the outer class


````java
public class Outer{
    public static class StaticNested{
        // code of the nested class
    }
}

Outer.StaticNested x = new Outer.StaticNested();

````

#### Member
- associated with the instance context of the outer class
- To create an instance of a member of a method inner class, you must create an instance of outer class first  
- can access private variables and methods of the outer class
- can access both static and instance variables and methods of the outer class

````java
public class Outer{
    class MemberNested{
        // code of the nested class
    }
}

````

#### Local
- associated with the context of specific method
- instances of the local inner class can only be created within the outer method context
- outer method local variables and parameters can only be accessed if they are **final or effectively final**: inside method and, static and instance outer class context

````java
public class Outer{
    public void myMethod(**final** String variable){
      class LocalNested{
        // code of the nested class
      }
    }   
}
````

#### Anonymous
- inline implementation or extension of an interface or \[extension\] of a class
- used to override operations
- outer method local variables and parameters can only be accessed if they are **final or effectively final**

````java
MyInterface myInterface = new MyInterface(){
    @Override
    public void someMethod(){
        // some code
    }
}
````

````java
        ConcreteClass concreteClass1 = new ConcreteClass() {
            @Override
            public void iHaveThis() {
                System.out.println("I have modified this");
            }
        };
````

````java
        List<String> names = Arrays.asList("Annie", "Carlos", "Jose", "Isidora");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        for (String name : names) {
            System.out.println(name);
        }
````
