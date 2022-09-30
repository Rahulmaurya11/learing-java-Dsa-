import java.util.Arrays;

public class Seccycle {
    public static void main(String[] args) {
        // find missing element in an array
        //1 to n array
        int[] arr = {0, 3, 5, 2, 1};
        System.out.println("given array : "+Arrays.toString(arr));
        sortit(arr);
        System.out.println("sorted array : "+Arrays.toString(arr));
 int missingval  = search(arr);
        System.out.println("missing value is:  "+missingval);
    }

    public static void sortit(int[] arr) {
        //use cyclic sort to sort array
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i]<arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
    }
    public static int search(int [] arr){
   for(int j = 0; j<arr.length;j++)
   {
       if (arr[j]!=j){
           return j;
       }
   }
        return arr.length;
    }
        public static void swap(int[] arr,int first,int second)
        {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
