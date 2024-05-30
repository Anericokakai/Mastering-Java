package oauth.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class NewInstanceMain {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
    Class<?> cars=    Class.forName("oauth.example.Games");

//    getting a single constructor
        Constructor<?> constructor=cars.getConstructor(String.class,int.class);


        System.out.println("constructor :"+constructor.toString());

//        Accessing all public constructors
        Constructor <?> [] constructors=cars.getConstructors();
        System.out.println(Arrays.toString(constructors));



    }
}
