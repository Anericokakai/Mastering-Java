package oauth.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

public  static void main(String[] args) {

    Cars bmw=new Cars("BMW m5 competion","black",2023);
    Cars mercedes= new Cars("S63s","white",2020);

    bmw.printCarInformation();

    mercedes.printCarInformation();

}


}