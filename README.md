
# Object creation in Java

## 1. Using the _new_ keyword

The new keyword is the basic ways of creating an object in java

>It is used if we know the types of objects to be created 

If we have a class in java, and we want to create an instance of the class in another class we need to create an instance of that class where 
we want to use it
the constructor enables us to create different instances of the same class just as we learned in [constructor chaining class ](https://github.com/Anericokakai/Mastering-Java/blob/constructorChaining/src/main/java/oauth/example/ApplicationOFConstructorChaining.java)

***
### Example of new keyword in Action

If we have a class called **_Cars_** and the car has different properties such as year,name and color
,We also have another class **_Main_** where we want to create an instance of the **_cars_** class

##### cars class code example

![image example](/images/cars.png)

[check the code here](/src/main/java/oauth/example/Cars.java)

We create public variables that are the properties that our cars will have
the cars
**NOTE:** we can create more than one constructor as long as we dont use the same number of parameters or types

[check out this example ](https://github.com/Anericokakai/Mastering-Java/blob/constructorChaining/src/main/java/oauth/example/Cars.java)

##### creating instances of the car Object
in our main method [here](/src/main/java/oauth/example/Main.java)  we create two instances of the **_Cars_** class **NOTE:** we are using the **_new_** keyword before the car class

![example of main method](/images/main.png)

When you create an instance of an Object you are also able to access all the Public methods that are in that Object
, in our case we are able to access the ``printCarInformation`` method from the bmw and mercedes instances 

#### NOTE

>Only public methods and variables can be access in another class

***

## 2. Using the Reflection method

>This method is used when we dont know the type of object to be created in the beginning and it is passed at run time

Before we have a chance to get constructors of a certain class we need to access the class itself
. To do this we use the ``Class`` method from ``java.lang.Class`` and access the ``forName()`` method

The ``forName('classNamehere')`` takes a String as an argument and the String is the class that we want to access its constructors

```java
Class<?> constructor = Class.forName("oauth.example.Games");
```
> If you are using inteliJ ultimate when you type the class name eg ``Games`` the IDE will provide the package name automatically if not
> you have to add the preceding  package name manually

To know the package name use the following image based on your application change it to fit yours

![how to access your package](/images/packageAccess.png)

## Steps While Creating Instances of constructors using reflection

 ### 1. ``Getting a single constructor``
     
To Get a single constructor method we use the ``constructor.getConstructor()``. This method takes in the parameters
of that the constructor we want to access takes . If it takes two parameters the ``getConstructor`` method should also take two

 ###### **_Example image_**
![example_image](/images/SingleConstructor.png)


Because the getConstructor Method takes an  array of classes we can use another syntax

```java
import java.lang.reflect.Constructor;

Constructor <?> constructor = cars.getConstructor(new Class []{String.class,int.class});
```

#### **TAKE NOTE**
In our ``Games class ``  we have a public constructor which takes in the ``name`` which is a ``String``  and ``ranking`` which ia an ``int``.
 In the example image [example_image](#_example-image_)  we also pass ``String.class`` and ``int.class`` this automatically refers to the same constructor in our ``Games`` class

###### _example game image_

![parametized constructor](/images/ParametizedConstructor.png)

When you try to access a private constructor using the getConstructor method a ``NoSuchMethodException`` will be thrown , you can not access a private Constructor using
the ``getConstructor `` method


### 2. ``Getting All Constructor``

to get all constructors we create an array of the ``Constructor `` class  .this provides us with only the public constructors

```java
import java.lang.reflect.Constructor;//        Accessing all public constructors
import java.util.Arrays;

Constructor<?>[] constructors = cars.getConstructors();
        System.out.println(Arrays.toString(constructors));


```

### 3. ``Getting Private constructor ``
To access the private constructors we need to use the ``getDeclaredConstructor()`` method

The method also takes in an array of  ParameterTypes  classess that represents the constructor we want to access 
```java
Constructor<?>  privateConstructor=cars.getDeclaredConstructor();
        System.out.println(privateConstructor.toString());

        
```
In our case we don't have any parameters in our private constructor [check it out here](/src/main/java/oauth/example/Games.java)
,that why we never passed ``parameterTypes`` unlike what we did [here](#1-getting-a-single-constructor)


### 3. ``Getting all public private default access,protected constructors``

In reflection, we are able to overide all the rules that are protecting our classes from being accessed in other classes
.When a constructor is private it is not accessible in other classes ,but when using reflection you can override this rule
and access private constructors in other classes

To learn more about scopes visit this branch [scopes in java]()

To get all constructors with different scopes we use the ``getDeclaredConstructors`` which we must initialise as an array  of constructors

### _Exception handling in reflection_

1. ``ClassNotFoundEsception``
This is thrown by the ``Class.forName()`` method is the class does not exist

2. ``MethodNotFoundException``
The ``MethodNotFoundException`` is thrown by the ``getConstructor()`` and [getDeclaredConstructor()](#3-getting-private-constructor-)

If you want to learn more about Exceptions in java  go to the [exceptionHandlingInJava](https://github.com/Anericokakai/Mastering-Java/tree/exceptionHandlingInJava) branch

