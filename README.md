# constructor Chaining
where we create different constructor of the same class and passing different parameters
Below image shows how to create objects without chaining 
![with no chaining ](/images/constructor.png) 




the java compiler will match each constructor with the number of arguments passed in each when we call it at the main function

### how to call multiple constructors while creating a single object

we  use the keyword ***this*** when we want to call multiple constructors when creating a single object
we use _this_ keyword which will calls our second constructor from our first constructor
we just need to pass the arguments that the second constructor takes

The image below shows an example of a simple chaining of constructors
![](/images/chaining.png)

### how the chained constructor code is compiled 
1. when the execution starts, the default constructor with no arguments is called 
2. _this_ keyword is encountered first which makes the compiler to switch to the second constructor
3. another _this_ keyword is encountered which makes the compiler switch to the third constructor

The execution starts at the third constructor since there are no more referencing _this_ keyword as it goes backwords
>The execution of constructor chaining follows the stuck data structure where the first in is the last to be executed 

# Limitation of _this_ keyword in relation with constructor chaining

#### 1. Recursive constructor invocation
. This happens when there is a loop that will never terminate between the constructors your code will not compile as java is aware of the exception and it will warn you about it
An example is shown below where  when we call the default constructor with no arguments it calls the second constructor with an arguments and the second constructor uses _this_ keyword to call the first constructor

Note that the execution of this program will never terminate 
![example of a recursive constructor invocation](/images/recursiveconstructorchaining.png)

#### 2. Constructor call must be the first statement in a constructor
any time we use _this_ keyword we need to call  _**this**_ keyword first before any other line fo code 
failure to this throws the constructor call must be a first statement in a constructor
### 3. Explicit Constructor call error
Expilict constructor error is thrown when  we try to use more than one _**this**_ method in a constructor


* [application of constructor chaininng](/src/main/java/oauth/example/ApplicationOFConstructorChaining.java)