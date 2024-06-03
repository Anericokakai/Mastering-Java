package oauth.example;

public class Car <T,V> {
    T  anything;
    V something;
    int price;
    Car(T anything,V something){
        this.anything=anything;
        this.something=something;

    }
    void printInfo(){
        System.out.println("\nSomething\t"+something);
        System.out.println("\n anything\t"+anything);
    }
}
