package Array.SolveQues;
import java.util.*;
public class SumOfElements {
    public static int SumElementsArr(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array sum : " + SumElementsArr(arr));
    }
}
