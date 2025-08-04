package ExceptionHandling;
//how to create custom exception
class AgeInValidExp extends Exception{
    AgeInValidExp(){
        super("Age is invalid!");
    }
    AgeInValidExp(String message){
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {

//        default constructor called -> o/p will be Age is invalid
//        AgeInValidExp ex1 = new AgeInValidExp();

//        parameterized constructor called-> o/p will be your message
//        AgeInValidExp ex2 = new AgeInValidExp("Invalid age");
    }
}
