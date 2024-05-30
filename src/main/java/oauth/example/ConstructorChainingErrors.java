package oauth.example;

//! THIS CODE WON'T RUN IT IS TO SHOW YOU THE ERRORS YOU MIGHT ENCOUNTER IN FUTURE

public class ConstructorChainingErrors {

    ConstructorChainingErrors(){
//   !      call the second constructor
        this(20);
        System.out.println("default constructor");
    }
    ConstructorChainingErrors(int num){
//        call the first constructor
//        this();
        System.out.println("ConstructorChainingErrors " + num);
    }
    public static void main(String[] args) {

    }
}
