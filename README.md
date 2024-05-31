# Core Concepts In Java 
To understand java we need to understand the core concepts that java builds from
## 1. What is an Object
Objects in ``OOP`` are similar to real world ,They have ``state `` and  ``behavior``
.States are stored in ``variables``  while ``behavior`` are exposed through ``methods or functions``

###### **_Example of states_**
state of an object can be ``color``,``price`` ,``name``,``model``

###### **_Behavior examples_**
Example of behaviors/ actions can be ``run engine``,``beeb horn``,``reverse``

### Why Objects are important
1. Code reusability ->Objects that already exists can be re-used by other developers
2. Easy debug
3. Modularity-> each Object is independent and can be maintained and improved independently


# Classes
A Class is an instance of an Object 
example if a class 

The variables are examples of [states examples here](#_example-of-states_)

The methods are examples of [behavior examples here](#_behavior-examples_)
#### Declaring a class 

```java
class MyClass{
//    variables constructors and mthod
}
```
> **_NOTE:_** if you are creating a class File the name should match with the name of your class
   
#### Declaring Members variables 
Members of a class are the  states 
example 
```java
public  int age;
public  String  name;
```
The ``Public`` is an access modifier  

### Access Modifiers
Access modifiers lets you control what other classes can see of you class

1. ``public`` allows the fields to be accessed from other classes
2. ``private`` fields with private are ony accessed within our class

If you want more on access modifiers check the [Encapsulation in Java]()

#### Example of a class

>Note that there is no main method here because the ``Car`` class  is only a blu print and it will be used in an application in our case the `Main`

![ Example of class](/images/ClassExample.png)
[Check out the example here](/src/main/java/oauth/example/Car.java)

#### Creating Objects of the class
![Example of creating o=Objects](/images/MainExample.png)

If you don't know how to create Objects Instances in Java check out [Object Creation In Java](https://github.com/Anericokakai/Mastering-Java/tree/ObjectCreationInJava)

>**_NOTE :_** The method that allows us to print the information below is the `printCar`  method.If you dont know about methods Check out [methods in java]() 
  

Note that when we run the `Main` we get the following results

The First result is the information of the ``bmw`` Instance we created of a ``Car`` while the second one is of the ``Toyota`` instance of the ``Car`` class
![example terminal print](/images/resExample.png)



