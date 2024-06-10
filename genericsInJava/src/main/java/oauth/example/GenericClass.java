package oauth.example;

public class GenericClass <T>{
  private  T anything;

    public GenericClass(T anything) {
        this.anything=anything;
    }

    void printInfo(){

        System.out.println("\t anything\t"+anything);
    }
}
