# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#arrays)

## Arrays
- An array is a fixed-length collection of elements of the same type indexed by int.
- default values:
  * null
  * 0
  * false 
- **length** is property of an array  

### Initialization
````java
// String[] aString 
// String aString[]
String[] aString = {"St1","St2","St3"};

int[] anInt = {1,2,3};

int[] primes;
primes = new int[]{2,3,5};
````

### Declaration
You instantiate **Arrays** when you use new type[value], you don't instantiate a type.
````java
String[] aString2 = new String[3]; // an Array of 3 Strings
        
int[] anInt2 = new int[16]; // an Array of 16 ints
        
Recyclable[] rubbish = new Recyclable[3]; // we have an Array of Objects that implement the Recyclable interface
        
Toy[] myToys = new Toy[3]; // an Array of 3 abstract Toys
````

### 2d Arrays
- don't need to be squared

````java
                  // 1st row, 2nd row
int[][] matrix = {{4,1},{2,0,5}}

MORE EXAMPLE

````



### Arrays Class
#### Array
- Arrays.copyOf(...)
- Arrays.copyOfRange(...)
- Arrays.fill(...)
- Arrays.binarySearch(...)
- Arrays.equals(...)
- Arrays.sort(...)
#### List
- List\<T\> Arrays.AsList(el1,el2,...) //fixed sized List

### Var-arg
- triple dot ... as parameter is an array of ...
- it could be zero or more

````java
public static void myMethod(String... args) {
        int size = args.length;
        System.out.println("size: " + size);
        if (size > 0) {
        String argZero = args[0];
          System.out.println("argZero: " + argZero);
          for (String e : args) {
            System.out.println(e);
          }
        }
}

public static void main(String[] args) {
        myMethod();
        myMethod("1", "2");
        myMethod(args);
}

````


