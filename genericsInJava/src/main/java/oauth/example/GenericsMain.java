package oauth.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GenericsMain {



    public static void main(String[] args) {
        // classes in Generics
GenericClass<String> stringGenericClass=new GenericClass< >("Anerico");
GenericClass<Integer> integerGenericClass=new GenericClass<>(1);

        System.out.println("<----------------Print the String values-------->\t".toUpperCase());

        stringGenericClass.printInfo();
        System.out.println("\t<----------------Print the integer values-------->\t".toUpperCase());
        integerGenericClass.printInfo();


//      !<----------------------  multiple generics parameters------------------>

       Car<String,Integer> bmw=new Car<>("Bmw x5",3_000_000);
       Car<Integer,Integer> mercedes= new Car<>(5_000_00,2024);

//       PRINT THE CAR INFO
        System.out.println("<----------------------  multiple generics parameters------------------>\n".toUpperCase());
        bmw.printInfo();
        mercedes.printInfo();

        //    !<----------------------Raw Types--------------------------->
        System.out.println("\n<----------------Raw Types-------->\n".toUpperCase());
        integerGenericClass.printInfo();

        GenericClass raw= new GenericClass("20");
        raw.printInfo();

    }



}