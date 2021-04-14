# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#flow-control)

## Flow Control

### Syntax 
You can omit curly braces if:
- There's a single statement inside an **if**.
- There's a single statement inside an **else**.
- There's a single statement aside a **while** loop.

````java
        int myVar = 1;

        while (myVar < 60) {

            if (myVar > 30)
                System.out.println("myVar > 30, myVar: " + myVar);
            else
                System.out.println("myVar < 30, myVar:" + myVar);

            myVar += 11;
        }


        while (myVar++ < 70)
            System.out.println("myVar < 70, myVar: " + myVar);
````

### switch
* Expressions don't need to be final.
* Expressions could be:
  *  byte
  *  short
  *  int
  *  char
  *  String
  *  enum

````java
String expression = "Used";
switch(expression){
    case "Used": 
        discount = price * 0.1;
        break;
    default: 
        discount = price;
}
````

### Loops

**for** statement:

````java
    int i = 0;
        for (; ; ) {
            if (i >= 5)
                break;

            System.out.println(i);
            i++;
        }
````


