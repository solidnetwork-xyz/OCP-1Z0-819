# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#exceptions)

## Exceptions
### Hierarchy
- Throwable **(checked)**
  - Error **(unchecked)**
  - Exception  **(checked)**
    - sql
    - io 
    - RuntimeException **(unchecked)**
      - NullPointer
      - Arithmetic
      - IndexOutOfBounds
      - IllegalArgument

### Catch
- Unrelated exceptions !(superclasses, subclasses) can be handled by the same catch block
- **finally** always is executed at the end, if there is a return, return is executed after finally
- try could work with finally only 
````java
try{
    
}catch(NullPointerException | ArithmeticException e){
    
}finally{
    // This always happen
    try{
        // try/catch embedded    
    }catch(){
        
    }    
}
````

### Flow
- After an exception is handled, the execution continues after the last catch handler.
````java
try{
    
    }catch(Exception e){
    System.out.println("exception is handled here");
}
System.out.println("execution continues here");
````
- if an exception is never handled, go to **finally** block and end the execution of that method
````java
try{
    throw new NullPointerException();
    }catch(MyException e){
    System.out.println("exception is not handled");
}finally{
   System.out.println("execution continues here");
}
System.out.println("This point is never reached");
````
### try-with-parameters

````java
try(/*initialise autocloseable resources*/){
    /* use resources */ 
}catch(){
    
}
/* implicitly formed finally block invokes close method on every autocloseable resource */
````
