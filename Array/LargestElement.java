package Array.SolveQues;
import java.util.Scanner;
public class LargestElement {

//    find the largest element in array
    public static int findLargestElement(int[] array){
        int largestElement = array[0];
        for(int i = 0 ;i < array.length ; i++){
            if(array[i] > largestElement)
                largestElement = array[i];
        }
        return largestElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the array value one by one: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int largestValue = findLargestElement(arr);
        System.out.println("Largest value: "+ largestValue);
    }
}
