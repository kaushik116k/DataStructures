package Algorithms;
import java.util.*;
public class SpiralAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int text_cases = sc.nextInt();
        for(int tc = 1; tc < text_cases; tc++){
            long m = sc.nextInt();
            long n = sc.nextInt();

            long i = m - 1, j = n - 1;

            long max = Math.max(i, j);
            long diag = Diagonal(max);

            if(max % 2 == 0){
                if(i < j){
                    System.out.println((diag + (max - i)));
                } else{
                    System.out.println((diag - (max - j)));
                }
            } else{
                if(i < j){
                    System.out.println((diag - (max - i)));
                } else{
                    System.out.println((diag + (max - j)));
                }
            }
        }
    }

    private static long Diagonal(long max) {
        return (max * max) + max + 1;
    }
}
