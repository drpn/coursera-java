package course3.examples;

// Single Inheritance: In Java, a class can inherit from only one other class, which is known as single inheritance. This decision was made to avoid the complexity of multiple inheritance.
// Interfaces: Java provides an alternative to multiple inheritance called interfaces. An interface is a list of method signatures, without any method implementations. Any class that implements an interface must provide implementations for all the methods defined in the interface.
// This allows for more flexibility and reusability in code.
// When designing Java solutions, it is recommended to start with interfaces and then develop classes based on those interfaces.
// Java allows multiple inheritance, but only for interfaces, not classes.

interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void methodB() {
        System.out.println("this is methodB");
    }

    @Override
    public void methodA() {
        System.out.println("this is methodA");
    }
    
}

public class Interfaces {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.methodA();
        myClass.methodB();
    }
}
