import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Finddup {
         public static void main(String[] args) {
             //1 to n array
             // find duplicate value in an array.
             int[] arr = {1, 3, 4, 2, 2};
             System.out.println("given array : " + Arrays.toString(arr));
              int dupllicate = sortit(arr);
             System.out.println("sorted array : " + Arrays.toString(arr));
             System.out.println("duplicate value is "+dupllicate);

         }

        public static int  sortit(int[] arr) {
            //use cyclic sort to sort array
            int i = 0;

                while (i < arr.length) {
                    if (arr[i]!=i+1) {

                        int correct = arr[i] - 1;
                    if ( arr[i] != arr[correct]) {

                        swap(arr, i, correct);

                    } else {{return arr[i];}

                    }
                }
                    else i++;
            }
            // find missing number

        return -1;
         }

        public static void swap(int[] arr,int first,int second)
        {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }