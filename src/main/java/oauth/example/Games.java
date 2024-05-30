package oauth.example;

public class Games {

    private int ranking;
    private String name;

//    ! PUBLIC CONSTRUCTOR WITH ARGUMENTS
  public  Games(String name,int ranking){
        this.name=name;
        this.ranking=ranking;
    }

//    ! PRIVATE CONSTRUCTOR
    private Games(){

    }

//    method to print the values
    public  void ShowVal(){
        System.out.println("Name: "+name+"\t"+"Ranking :"+ranking);
    }
}

