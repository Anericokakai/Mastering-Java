package oauth.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args)  {
try{
exceptionHandling2("text.txt");}
catch(FileNotFoundException e){
    System.out.println(e.getLocalizedMessage());
}
    }
    //  Exception handling with Throw keyword
    private  static  void exceptionHandling2 (String filename) throws FileNotFoundException {
        FileReader fileReader= new FileReader(filename);
    }

    //!    Exanple of a checked exception and how to handle it

    private static void exceptionHandling() {

        try {
            FileReader fileReader = new FileReader( "/src/main/resources/oauth/token.txt");
        } catch (FileNotFoundException e){
            System.out.println("File not found");

        }
    }





}