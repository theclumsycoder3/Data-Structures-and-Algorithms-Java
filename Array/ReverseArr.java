package Array.SolveQues;

import java.util.Scanner;

public class ReverseArr {

    public static int[] reverseArr(int[] array){
        /*for(int i = 0; i <array.length / 2 ; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }*/

        int temp[] = new int[array.length];
        for(int i = array.length - 1; i>=0; i--){
            temp[temp.length-i-1] = array[i];
        }
        return temp;
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

        int reverse[] = reverseArr(arr);

        for(int value : reverse){
            System.out.print(value + " \t ");
        }

    }
}
