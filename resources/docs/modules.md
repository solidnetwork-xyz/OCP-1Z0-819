# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#modularity)

## Modularity

Listing all modules
````shell
$java --list-module
````

### Types
- Standard modules: **java.***
- JDK modules: **jdk.***

### Some modules
- java.base
- java.compiler
- java.desktop
- java.logging
- java.net.http
- java.se
- java.sql
- jdk.compiler
- jdk.httpserver
- jdk.jartool
- jdk.javadoc
- jdk.jdeps
- jdk.jlink
- jdk.jshell


### Declaration

- A module is declared in a **module-info.java** file.
- It's placed in the root directory.
````java
module modulename {
    requires [transitive] ...;
    exports ... [to] ...;
}
````
