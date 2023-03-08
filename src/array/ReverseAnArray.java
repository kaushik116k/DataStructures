package array;
public class ReverseAnArray {
    public static void main(String[] args) {
        BasicFunctions array = new BasicFunctions();
        int arr[] = array.dynamicArray();
        int length = arr.length;

        /*
            -- Two pointers Solution
            -- swap first and last elements
            -- till the pointers meet each other
         */
        int first = 0, last = length - 1;
        while(first <= last){
            array.swap(arr, first, last);
            first++; last--;
        }

        array.print(arr);
    }


}

