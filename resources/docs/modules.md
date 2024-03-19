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
- modules is a group of packages
- A module is declared in a **module-info.java** file.
- It's placed in the root directory package.
- Unique module name reverse-dns convention
- classes of a given package must be all be within the same module

````java
module <module-name> {
    requires <other module names>   [transitive] [static]...;
    exports <packages of this modules to other modules that require them> ... [to] ...;
    opens <packages of this modules to other modules via reflection>;
    users <services provided by other modules>;
    provides <services to other modules> with <service implementations>;
    version <value>;
}
````

### requires
- **java.base** is implied for all modules
- you can use comma-separated lists of module names
- **requires** is like **import**
- **requires transitive** is **import** and make it **imported** for all that **requires** me
- **requires static** is available at compile time only

````java
module com.some {
    requires java.logging;
    requires transitive org.acme;
    requires static com.foo;
}
````

### exports
- **exports** is like **public** (public and protected types not default)
- all public classes are hidden access unless the containing package is explicitly exported    
- **exports** \<packages\> **to** \<other modules\> restricts visibility to those modules
- you can use comma-separated lists of module names

````java
module com.some {
    exports com.some.data;
    exports com.some.app to com.other;
}
````

### opens
- works similar to **export**
- also makes all its non-public types available via reflection
- modules that contain injectable code should use **opens**

````java
module com.some {
    exports com.some.data;
    exports com.some.app to com.other;
}
````

### services
- services consumer y provider reference a service module with **require**