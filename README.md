
# Object creation in Java

## 1. Using the _new_ keyword

The new keyword is the basic ways of creating an object in java

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

## 2. Using the newInstance() method


