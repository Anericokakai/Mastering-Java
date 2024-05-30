package oauth.example;

public class ExplicitConstructorCallError {

    ExplicitConstructorCallError(){
        System.out.println("first constructor");
    }
    ExplicitConstructorCallError(int num){
        this();
//        this(20,14.4);
    }
    ExplicitConstructorCallError(int num, double d){
        System.out.println("third  constructor");
    }
}
