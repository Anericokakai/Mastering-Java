package oauth.example;

public class ApplicationOFConstructorChaining {

    int userId;
    String name;
    String experience;
    int age;
//     create the first Constructor
    ApplicationOFConstructorChaining(int userId,String name,int age){
        this.userId=userId;
        this.name=name;
        this.age=age;

    }

//    ! second constructor
    ApplicationOFConstructorChaining(int userId,String name,int age,String experience){
//        we can call the first constructor here
        this(userId,name,age);
        this.experience=experience;
    }
    public void printSome(){
        System.out.println( "user id: "+userId + "name : " + name + " Age :" + age + "Experience " + experience);
    }

    public static void main(String[] args) {
        ApplicationOFConstructorChaining application= new ApplicationOFConstructorChaining(1,"anerico kakai",19,"junior developer");
        application.printSome();
    }
}
