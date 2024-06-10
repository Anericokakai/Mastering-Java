package oauth.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

public  static void main(String[] args) {
//    Create  objects of car
 Car bmw=new Car();
 Car toyota=new Car();

//We use the methods(behaviors) in that class to  change the variables(states))
 bmw.changeColor("yellow");
 bmw.changeName("bmw");
 bmw.ChangeModel("2023 x5");
 bmw.ChangePrice(50_000.00);
 bmw.printCar();

// Another instance of the Object Car
 toyota.changeColor("white");
 toyota.changeName("toyota");
 toyota.ChangeModel("2023 xl 570");
 toyota.ChangePrice(80_000.00);
 toyota.printCar();

}


}