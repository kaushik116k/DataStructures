package Algorithms;
import java.util.*;

public class MissingNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        int size = (int) n;
        long arr[] = new long[size];

        long sum = 0;
        long actualSum = (n * (n + 1) )/2;
        for(int i = 0; i < n - 1; i++){
            arr[i] = sc.nextLong();
            sum = sum + arr[i];
        }

        System.out.println(actualSum - sum);
    }
}
