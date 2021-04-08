# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#arrays)

## Arrays
### Initialization
````java
String[] aString = {"St1","St2","St3"};

int[] aInt = {1,2,3};
````

### Declaration
You instantiate **Arrays** when you use new type[value], you don't instantiate a type.
````java
String[] aString2 = new String[3]; // an Array of 3 Strings
        
int[] aInt2 = new int[16]; // an Array of 16 ints
        
Recyclable[] rubbish = new Recyclable[3]; // we have an Array of Objects that implement the Recyclable interface
        
Toy[] myToys = new Toy[3]; // an Array of 3 abstract Toys
````
