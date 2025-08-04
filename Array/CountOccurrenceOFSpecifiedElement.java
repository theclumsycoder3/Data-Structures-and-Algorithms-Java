package Array.SolveQues;
import java.util.*;
public class CountOccurrenceOFSpecifiedElement {
    public static int CountOccurrence(int[] arr, int target){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(target == arr[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int targetElement = sc.nextInt();

        System.out.println("Occurrence of the element "+targetElement+ " is: "+ CountOccurrence(arr,targetElement));
    }
}
