import java.util.ArrayList;
import java.util.Arrays;
//Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of
//array without changing the order of positive element and negative element.
//
//Example 1:
//
//Input :
//N = 8
//arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
//Output :
//1  3  2  11  6  -1  -7  -5

public class SegregateArray {
    public static void main(String[] args)
    {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        segregat(arr);

    }
    public static void segregat(int[] arr){
        ArrayList<Integer>  newarr = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < 0) {
                newarr.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                newarr.add(arr[i]);
            }
        }
        System.out.println(newarr);
    }


}