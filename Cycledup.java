import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
    public class Cycledup {
    public static void main(String[] args) {
        //1 to n array
        // fidnd missing number
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println("given array : "+ Arrays.toString(arr));
        sortit(arr);
        System.out.println("sorted array : "+Arrays.toString(arr));

        List<Integer> ans = new ArrayList<>();
        for (int index = 0 ; index < arr.length;index++){
            if (arr[index] != index+1)
            {
                ans.add(index+1);
            }
        }
        System.out.println("missing value "+ans);

    }

    public static void  sortit(int[] arr) {
        //use cyclic sort to sort array
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if ( arr[i]<=arr.length && arr[i] != arr[correct]) {

                swap(arr, i, correct);

            }else {
                i++;
            }
        }
        // find missing number

    }

    public static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

