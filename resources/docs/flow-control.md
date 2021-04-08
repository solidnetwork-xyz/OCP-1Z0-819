# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#flow-control)

## Flow Control
### switch
condition doesn't need to be final.

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


