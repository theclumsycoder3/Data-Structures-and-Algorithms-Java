package BasicCode;
import java.util.Scanner;
public class checkNum_pos_neg_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Number is positive");
        }
        else if(a<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is zero");
        }


    }
}
