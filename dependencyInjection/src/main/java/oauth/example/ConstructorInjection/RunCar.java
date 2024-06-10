package oauth.example.ConstructorInjection;

public class RunCar {

    /* if  we want to run the car we need  to initialize it here
    @params  we are forced to pass the Engine and Fuel objects in order to run the car because of the
    constructor that we created in the Car class


     */
    public static void main(String[] args) {
        Engine engine=new Engine();
        Fuel fuel=new Fuel();

    /*
    Any time we create a car we need the engine and fuel as @params else our code won't compile
     */
        Car car= new Car(engine,fuel);
        car.printCarStatus();
    }
    

}
