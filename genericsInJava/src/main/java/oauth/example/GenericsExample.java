package oauth.example;

import java.util.ArrayList;
import java.util.List;

class GenericsExample {

//    NORMAL JAVA WITHOUT GENERICS


    public static void main(String[] args) {
        System.out.println("<--------non generic example-------------->".toUpperCase());
        List myList=new ArrayList();
        myList.add("john");
        String  user1= (String) myList.get(0);
        System.out.println(user1);

        //    with generics
        List <String> myList2=new ArrayList<>();
        myList2.add("Anerico");
        String user2= myList2.get(0);
        System.out.println("<----------------Generic example----------------> ".toUpperCase());
        System.out.println("Name :"+user2);


    }




}