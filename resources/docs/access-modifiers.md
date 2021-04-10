# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#access-modifiers)

## Access modifiers
- **protected**: package, subclasses.
- **no-modifier**: package.

````java
package com.prottonne.accessmodifiers.other;

public class AccessClass {

    public int publicField = 10;

    protected int protectedField = 15;

    int noModifierField = 20;

}
````

````java
package com.prottonne.accessmodifiers;

import com.prottonne.accessmodifiers.other.AccessClass;

public class AccessSubClass extends AccessClass {
    
    public static void main(String[] args) {
        
        AccessSubClass accessClass = new AccessSubClass();
        
        System.out.println(accessClass.protectedField); // this is a subclass of AccessClass
        
        System.out.println(accessClass.publicField);

    }
}
````