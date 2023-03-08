package array;

import java.util.Scanner;

public class BasicFunctions {
    static Scanner sc = new Scanner(System.in);
    public int[] dynamicArray(){
        System.out.println("Enter length of array");
        int length = sc.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter elements of array");
        for(int idx = 0; idx < length; idx++){
            arr[idx] = sc.nextInt();
        }

        return arr;
    }
    public void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public void print(int arr[]){
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
