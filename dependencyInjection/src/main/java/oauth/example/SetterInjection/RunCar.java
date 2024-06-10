package oauth.example.SetterInjection;

public class RunCar {

    public static void main(String[] args) {
        Car car= new Car();
        /*
        Setters Injection
        In the setters injection the problem is
        no warning will be provided if you fail to inject
        a dependency and if the dependency if a necessity the application
        will not give you any warning
         */

//        If a necessary dependency is added to the car  we will never know since no warning is thrown
        car.setFuel(new Fuel());
//        try comment out one line 16 and run the application
        car.setEngine(new Engine());

        car.printCarStatus();

    }
}
