import java.util.Arrays;

public class Binaryfirstlast {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 67, 123, 125};
        int target = 5;
        findfirstlast(arr, target);
    }

    public static void findfirstlast(int[] arr, int target) {
        int[] ans = {-1, -1};

        int first = Search(arr, target, true);
        int last = Search(arr, target, false);
        ans[0] = first;
        ans[1] = last;
        System.out.println("first index is " + Arrays.toString(ans));


    }

    public static int Search(int[] arr, int target, boolean Firstindex) {
        int start = 0;
        int ans = -1;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;

            } else
            // potential answer is found
            {
                ans = mid;
                // now lets check left hand side of an array for possible target value
                if (Firstindex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }


        }
        return ans;
    }
}
