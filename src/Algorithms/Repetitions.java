package Algorithms;

import java.util.*;
public class Repetitions {
    /**
     * Hi I am kaushik
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dna = sc.next();

        if(dna.length() == 1){
            System.out.println(1);
            return;
        }

        int i = 0, j = 0;
        int longest = 0;
        char s_long = ' ';

        int temp_long = 1;
        char s_temp = ' ';
        while(j < dna.length()){
            if(dna.charAt(i) == dna.charAt(j)){
                temp_long++;
                j++;
                s_temp = dna.charAt(j - 1);
            } else {
                if (longest < temp_long){
                    longest = temp_long;
                    temp_long = 1;
                    s_long = s_temp;
                }
                j++;
                i = j -1;
            }
        }

        if(longest < temp_long) {longest = temp_long; s_long = s_temp;}
        System.out.println(longest);
        System.out.println(s_long);
    }
}
