package ExceptionHandling;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Started...");
        try {
//            the args[] array comes from command-line arguments.
//            But when you're running the code directly inside an IDE,
//            the command-line arguments (args[0], args[1])
//            are usually not provided by default
          /*  int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]); */


//        Can Use Scanner Instead of args[]
            System.out.print("Enter first number: ");
            int n1 = Integer.parseInt(sc.nextLine());

            System.out.print("Enter second number: ");
            int n2 = Integer.parseInt(sc.nextLine());

            System.out.println("We have got two nums");
            int result = n1 / n2;
            System.out.println("Division is  " + result);
            if(n2 < 10){
                throw new AgeInValidExp("My age is Invalid");
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Invalid Input");
            System.out.println(e.getMessage());
        }
        catch(AgeInValidExp e){
            System.out.println("Invalid N2");
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error!!");
            System.out.println(e.getMessage());
        }
        finally{
//            Always gets executed
            System.out.println("I am finally block");
            System.out.println("Closing all the resources");
        }
        System.out.println("Terminated...");

    }
}
