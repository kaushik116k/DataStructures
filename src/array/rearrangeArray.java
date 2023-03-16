package array;

/*
    -- Rearrange the array such that arr[i] = i;
    -- if there is no element exists mark it as -1;
    -- ex: input[] = {0, -1, -1, 2, 4, 5}
    --    output[] = {0, -1, 2, -1, 4, 5}
*/
public class rearrangeArray {
    public static void main(String[] args) {
        BasicFunctions array = new BasicFunctions();

        int[] arr = array.dynamicArray();
        int length = arr.length;

        for(int idx = 0; idx < length; idx++){
            if(arr[idx] != -1 && arr[idx] != idx){

            }
        }
    }
}
