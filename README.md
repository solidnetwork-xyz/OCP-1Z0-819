# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

## [ASCII symbols and Java Statements](https://github.com/joseosuna-engineer/ASCII-symbol-and-java-statements/blob/main/README.md)

## Keywords
![](resources/images/keywords.PNG)

## Packages
**package** is optional.

## [Access modifiers](resources/docs/access-modifiers.md)

## [Class](resources/docs/class.md)

## [Types](resources/docs/types.md)

## [Variables](resources/docs/variables.md)

## [Operators](resources/docs/operators.md)

## [Flow Control](resources/docs/flow-control.md)

## [Arrays](resources/docs/arrays.md)

## [Collections](resources/docs/collections.md)

## Objects in memory
- **Variables** are stored in the **Stack**.
- **Objects** are stored in the **Heap**.
- **Object references** are pointers and variables, they are stored in the **Stack**.

## [Exceptions](resources/docs/exceptions.md)

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

## Assertions

````java
assert <boolean expression>;
assert <boolean expression> : <error text expression> ;
````

## [Lambdas](resources/docs/lambdas.md)

## [Streams](resources/docs/streams.md)

## [IO](resources/docs/io.md)

## [Threads](resources/docs/threads.md)

## [Modularity](resources/docs/modules.md)

## Annotations
- **@FunctionalInterface** enforce the definition of a functional interface: only one abstract method
- **@Override** verify that a method actually overrides a parent operation
- **@Deprecation**
- **@SuppressWarnings** unchecked or deprecation