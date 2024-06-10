package oauth.example;

//! CONSTRUCTOR CHAINING EXAMPLE
public class CarsWithConstructorChaining {
    CarsWithConstructorChaining(){
        this(20);

        System.out.println("this is the default constructor");
    }
    CarsWithConstructorChaining(int num){
        this(20,50);
        System.out.println("this is the second constructor");

    }

    CarsWithConstructorChaining(int num,int num2){

        System.out.println("this is the third constructor");
    }
    public static void main(String[] args) {
        CarsWithConstructorChaining car = new CarsWithConstructorChaining();
    }
}
