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

ranges: +/- **2.1MM**


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
````java
String[] aString2 = new String[3];
int[] aInt2 = new int[16];
````

