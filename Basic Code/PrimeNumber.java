package BasicCode;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(isPrime(n));
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c ==0){
                return false;
            }
            c++;
        }
        /*if(c * c >= n){
            return true;
        }
        return false;
        */
//        OR
        return c * c > n;
    }
}
