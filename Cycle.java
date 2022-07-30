
import java.util.Arrays;

public class Cycle {
    // using cycle sort algorithm to sort an arrays,
    // we sort array by comparing element value with index value i.e index value -1;
    public static void main(String[] args) {
        int [] arr = {3,5,2,1,4};
        Sortit(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void Sortit(int [] arr){
        int i = 0;
       while(i<arr.length){
            int correct = arr[i]-1;
if (arr[i]!=arr[correct]){
    swap(arr,i, correct);
}else{i++;}


        }
            }
    public static void swap(int [] arr, int first , int second )
    {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;


    }
}

