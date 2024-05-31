package oauth.example;

public class Cars {
    String name;
    String color;
    int year;
    Cars(String name,String color,int year){
        this.name=name;
        this.color=color;
        this.year=year;
    }

    public void  printCarInformation(){
        System.out.println("Name: "+name +" Color: "+color+" Year: "+year);
    }
}
