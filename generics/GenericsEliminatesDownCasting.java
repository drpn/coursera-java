package generics;

/**
 * Sure! Let's consider an example to understand how generics eliminate the need for downcasting.

Suppose we have a class called `Box` that can hold any type of object. Without generics, the `Box` class would be defined as follows:

```java
public class Box {
    private Object item;

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}
```

In this case, when we retrieve an item from the `Box`, we need to downcast it to its actual type before using it. For example:

```java
Box box = new Box();
box.setItem("Hello");

String item = (String) box.getItem(); // Downcasting to String
System.out.println(item.toUpperCase()); // Using the String without downcasting
```

Here, we downcast the retrieved item to `String` because we know that we stored a `String` in the `Box`. However, if we mistakenly store a different type of object, such as an `Integer`, in the `Box`, the downcast will result in a `ClassCastException` at runtime.

Now, let's see how generics eliminate the need for downcasting. We can modify the `Box` class to use generics as follows:

```java
public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
```

With generics, we can specify the type of object that the `Box` can hold. Now, when we retrieve an item from the `Box`, we don't need to downcast it because the type is already known. For example:

```java
Box<String> box = new Box<>();
box.setItem("Hello");

String item = box.getItem(); // No need for downcasting
System.out.println(item.toUpperCase()); // Using the String without downcasting
```

In this case, the type of the `Box` is specified as `String`, so the `getItem()` method returns a `String` directly. There is no need for downcasting, and the code is type-safe. If we try to store a different type of object, the compiler will generate an error, preventing us from making type-related mistakes.

By using generics, we can write type-safe code without the need for explicit downcasting, reducing the risk of runtime errors and improving code readability and maintainability.
 */
public class GenericsEliminatesDownCasting {
    public static class Box {
        private Object item;

        public void setItem(Object item) {
            this.item = item;
        }

        public Object getItem() {
            return item;
        }
    }

    public static class BoxWithGenericType<T> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }

    public static void main(String[] args) {
        
        // Ex.1
        try {
            Box box2 = new Box();
            box2.setItem(23);

            // Downcasting to String throws java.lang.ClassCastException at runtime. No complaints at compile time
            String item2 = (String) box2.getItem(); 
            System.out.println(item2.toUpperCase()); // Using the String without downcasting
        } catch(ClassCastException e){
            System.out.printf("[ERROR] thrown: %s", e.getMessage());
        }


        // Ex.2
        // BoxWithGenericType<String> box = new BoxWithGenericType<>();
        // box.setItem(23); // error with type-safety

        // Downcasting to String throws java.lang.ClassCastException at runtime. No complaints at compile time
        // String item = box.getItem(); 
        // System.out.println(item.toUpperCase()); // Using the String without downcasting
    }

}