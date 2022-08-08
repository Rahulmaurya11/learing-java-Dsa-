import java.util.Arrays;

public class RotateArraypractic1 {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        RotateIt(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void RotateIt(int[] arr){
        int i =0;
        int end = arr.length-1;
        int temp=0;
        while (end>i){
            if(end == arr.length-1){
                //take last value and keep it in temp  (1)
                temp = arr[end];
            }
            if (end == i+1){
                //place temp element to empty space
                i=temp;
            }
            // swap every element to next index (2)
            swap(arr,end-1,end);
            end--;
        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
