package BasicCode;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /*int max = a;
        if(b > max){
            max = b;
        }if(c > max){
            max = c;
        }*/

//        OR

        /*int max = Integer.MIN_VALUE;
        if(a > b){
            max = a;
        }else{
            max = b;
        }
        if(c > max){
            max = c;
        }*/

//        OR

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);

    }
}
