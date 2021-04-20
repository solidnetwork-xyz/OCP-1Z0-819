# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#threads)

## Java Concurrency and Multithreading

### Runnable
- run

````java
public class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        // thread action
    }
}

public class Main{
    public static void main(String[] args) {
        MyRunnableThread rT = new MyRunnableThread();
        new Thread(rT).start();
        new Thread(rT).start();
        new Thread(rT).start();
        new Thread(rT).start();
        // main thread actions
    }
}
````

### Thread 
- implements Runnable
- extends **Thread** is not a flexible design  
- start
- isAlive
- interrupt // it's a signal, it does nothing, use when running
- isInterrupted 
- sleep
- currentThread
- wait // synchronized block
- notify // synchronized block
- notifyAll // synchronized block

````java
public class MyExtendedThread extends Thread {
    @Override
    public void run() {
        // thread action
    }
}

public class Main{
    public static void main(String[] args) {
        Thread thread = new MyExtendedThread();
        thread.start();
        // main thread actions
    }
}
````

### Lambda
````java
public class Main{
    public static void main(String[] args) {
        Runnable r = () -> {...};
        Thread t = new Thread(r);
        t.start();
    }
}
````

### Thread.State
- **NEW** // can transition to **RUNNABLE**
- **RUNNABLE** // Thread is executing. can transition to **all** states except NEW. after catching InterruptedException is **RUNNABLE**
- **BLOCKED** // can transition to **RUNNABLE**
- **WAITING** // can transition to **RUNNABLE**
- **TIMED_WAITING** // can transition to **RUNNABLE**
- **TERMINATED**

### Synchronized monitor object (BLOCKED)
````java
public class MyClass{
    public synchronized void myMonitor(){
        // monitor object in the current object
    }
}
````

````java
public class MyClass{
    public static synchronized void myMonitor(){
        // use a class as a monitor
        // it'll block your thread against the overall class
    }
}
````

````java
public class MyClass{
    public void myMethod(){ }
}

public class Main{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Runnable r = () -> {
            // arbitrary object
            // synchronized block
            synchronized (myClass){
                myClass.myMethod();
            }
        };
        new Thread(r).start();
    }
}
````

### WAITING
````java
public class Main{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Runnable r = () -> {
            synchronized (myClass){
                // wait until notify
                myClass.wait();
            }
        };
        Thread t = new Thread(r);
        t.start();

        synchronized (myClass){
            // wake up 
            myClass.notifyAll();
        }
    }
}
````

### Locking problems
- **Starvation** // Thread is waiting for a resource blocked by another busy thread   
- **Livelock** // Threads form an indefinite loop, expecting confirmation of completion from each other
- **Deadlock** // Two or more threads are blocked forever, waiting for each other

### Thread-Safe code
- local variables and method arguments are thread-safe
- each thread operates with its own stack
- immutable objects in shared heap memory are thread-safe
