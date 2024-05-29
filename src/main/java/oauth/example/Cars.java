package oauth.example;

public class Cars {
    Cars (){
        System.out.println("this is the default constructor");
    }
    Cars (int num){
        System.out.println("this the second constructor");
    }

    public static void main(String[] args) {
//  call th constructors while creating object
        Cars cars=new Cars();
        Cars cars2=new Cars(10);
    }
}
