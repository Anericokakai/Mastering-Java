package oauth.example;

class  Car{
    //    variables
    String color;
    double price;
    String model;
    String name;

    //    methods or functions
    void changeColor(String color) {
        this.color = color;
    }

    void ChangePrice(double price) {
        this.price = price;
    }

    void ChangeModel(String model) {
        this.model = model;
    }

    void changeName(String name) {
        this.name = name;
    }

    //    print each car
    void printCar() {
        System.out.println("\n<------PRINTING INFORMATION OF " + name + " CAR ----------->".toUpperCase());
        System.out.println("Name : " + name + "\n");
        System.out.println("Price : " + price + "\n");
        System.out.println("Color : " + color + "\n");
        System.out.println("Model : " + model + "\n");
    }


}