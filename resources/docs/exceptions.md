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
- **finally** always is executed
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

### try-with-resources

````java
try(/*initialise autocloseable resources*/){
    /* use resources */ 
}catch(){
    
}
/* implicitly formed finally block invokes close method on every autocloseable resource */
````

## Logging API
- module: requires java.logging
- import java.util.logging.*
- Levels from bottom to top:
  - Severe
  - Warning
  - Info
  - Config
  - Fine
  - Finer
  - Finest

  