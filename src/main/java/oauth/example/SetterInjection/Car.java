package oauth.example.SetterInjection;

public class Car {

    Engine engine ;
    Fuel fuel;
//    Setters to do dependency Injection

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }
    void  printCarStatus(){
        if (engine==null||fuel==null){
            System.out.println("The car can not run without fuel and engine ".toUpperCase());
            return;
        }
        System.out.println("Car is able to run".toUpperCase());
    }
}
