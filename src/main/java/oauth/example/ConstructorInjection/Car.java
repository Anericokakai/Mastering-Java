package oauth.example.ConstructorInjection;

public class Car  {
    Engine engine;
    Fuel fuel;
    Car(Engine engine,Fuel fuel){
        this.engine=engine;
        this.fuel=fuel;
    }

    void printCarStatus(){
        if(engine==null||fuel==null){
            System.out.println("Car cannot run without both engine and fuel");
            return;
        }
        System.out.println("car is able to run".toUpperCase());
    }
}
