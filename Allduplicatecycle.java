import java.util.ArrayList;
import java.util.Arrays;

public class Allduplicatecycle {
    public static void main(String[] args) {
        int[] arr= {4,3,2,7,8,2,3,1};
        Cyclesort(arr);
        System.out.println(Arrays.toString(arr));
               // apply cycle sort to find all duplicate values
int[] ans = wrongindex(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static void Cyclesort(int[] arr){
        int i = 0;

        while (i<arr.length){
            int correct = arr[i]-1;
            if (arr[i]!=arr[correct]){


                swap(arr,i,correct);
            }else {
                i++;
            }
        }

    }
    public static int[]  wrongindex(int[] arr) {
        System.out.print("duplicate value are ");
        for (int i = 0; i < arr.length; i++) {
            int correct =i+1;
            {
                if (arr[i] != correct) {
                  return new int[]{arr[i]};
                }
            }
        }
        return new int[] {-1,-1};
    }
        public static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }

