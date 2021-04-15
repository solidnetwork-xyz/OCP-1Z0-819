# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#class)

## Class
- if object is null, the **instanceof** operator returns false.
- if super class has a constructor with parameters, and you extend it, you must call super(parameters)

### Class and Object Initialization
- All code of class (static), only once per class
- Each object instance and its parents

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


### Comparable interface
- We need to implement **int compareTo(T other)**
- Returns:
    - **0**: this == other
    - **1**: this > other
    - **-1**: this < other

````java
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

### Main class
```java
public static void main(String[] args){}
```
Non-static field 'declared out of main' cannot be referenced from a static context.

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
