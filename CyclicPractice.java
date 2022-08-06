public class CyclicPractice {
 //love babbar dsa sheet Q : Find Missing And Repeating
 //Given an unsorted array Arr of size N of positive integers. One number 'A' from set
 // {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.
    public static void main(String[] args) {
        int[] arr = {2, 2};
        Cyclesort(arr);
        boolean remis;
        int repeating = findmissing(arr, true);
        int missing = findmissing(arr,false);
        System.out.println("missing value in an arrya is "+ missing );
        System.out.println("repeating value in an array is " +repeating );
    }

    public static void Cyclesort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int findmissing(int[] arr, boolean remis) {
        for (int i = 0; i < arr.length; i++) {
            int correct = arr[i] - 1;
            if (arr[i] != correct) {
                if (remis) {
                    return arr[i];//repeating value
                } else {
                    return correct;
                }//missing value
            }
        }
return -1;
    }
}