package oauth.example;

public class ConstructorCallException {
    ConstructorCallException(){
        System.out.println("this will be your second call");
// calling this constructor as the second argument  will automatically throw an error
//        this(20);
    }
    ConstructorCallException(int num){
        System.out.println("this will be your second constructor call");
    }

    public static void main(String[] args) {
 ConstructorCallException callException = new ConstructorCallException();
    }
}
