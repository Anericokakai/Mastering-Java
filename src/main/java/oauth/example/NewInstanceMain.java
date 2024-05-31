package oauth.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class NewInstanceMain {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> cars=    Class.forName("oauth.example.Games");

//    getting a single public constructor
        System.out.println("\n<------------getting a single public constructor----------->\n".toUpperCase());
        Constructor<?> constructor=cars.getConstructor(String.class,int.class);


        System.out.println("constructor :"+constructor.toString());

//        Accessing all public constructors
        System.out.println("\n<------------Accessing all public constructors------------->\n".toUpperCase());
        Constructor <?> [] constructors=cars.getConstructors();
        System.out.println(Arrays.toString(constructors));

//        Accessing Private constructor using getDeclaredConstructor;
        System.out.println("\n<----------Accessing Private constructor using getDeclaredConstructor;---------------> \n".toUpperCase());
        Constructor<?>  privateConstructor=cars.getDeclaredConstructor();
        System.out.println(privateConstructor.toString());


// Accessing all private public protected and default constructors
        Constructor<?> [] allConstructors=cars.getDeclaredConstructors();
//        loop array
        System.out.println("\n<---------Access all constructors private,public protected default-----------------> \n".toUpperCase());
        for( Constructor<?> c:allConstructors){

            System.out.println(c.toString());

        }

    }
}