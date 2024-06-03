# Generics in Java
Generics allows Types ,Classes and interfaces to be passed as paramters when defining interfaces classess and methods

It allows code reusability with different inputs.

##### example generic

```java
import java.util.ArrayList;
import java.util.List;

class GenericsExample{
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Anerico kakai");
        String  user2=myList.getFirst();
        System.out.println(user2);
    }

}
```
run `GenericsExample` or checkout the implementation [here](/src/main/java/oauth/example/GenericsExample.java)
Note that we are passing ``<String>`` as a generic to the ``List`` interface .
Java is able to know that anything we pass to the arrayList is a String and we don't have to type check while accessing items in the list

##### Example without Generics
```java
public static void main(String[] args) {
    List myList=new ArrayList();
    myList.add("john");
    String  user1= (String) myList.get(0);
    System.out.println(user1);
}
```

## Generics in classes

If we want to reuse a class that can have different types
to create a generic class we use ``<T>``
before the cally braces .``T`` stands for type which can be a class, interface or a **non-primitive** dataType

>We donr pass primitive data types in generics


##### Example of a generics class

```java
class GenericExample<T>{
    T anything;
    
    GenericExample(T anything){
        this.anything=anything;
    }
}
```
We are passing t as a parameter the ``T`` is kind of your dataType, if you want to pass more types seperate them by a comma

##### Example with multiple paramters
```java
class  GenericExample<T,V>{
    T something;
    V anything;
    GenericExample(T something,V anything){
        this.anything=anything;
        this.something=something;
        
    }
    void printInfo(){
        System.out.println("Something\t"+something);
        System.out.println("\t anything\t"+anything);
    }
}
```

checkout example [here](/src/main/java/oauth/example/GenericClass.java)
and its Object Creation [here](/src/main/java/oauth/example/GenericsMain.java)

### Creating a generic Object
When Creating a generic Object, we can pass anything inside the ``<>`` as long as it not a primitive data type

##### Example
```java
public static void main(String[] args) {
    genericExample<String> genericString=new GenericExample<>("Hello there");
    
    genericExample<Integer> genericInt=new GenericExample<>(30);
}
```

### emaple with [with multiple paramters](#example-with-multiple-paramters)
```java
public static void main(String[] args) {

    Car<String,Integer> bmw=new Car<>("Bmw x5",3_000_000);
    Car<Integer,Integer> mercedes= new Car<>(5_000_00,2024);
}
```


