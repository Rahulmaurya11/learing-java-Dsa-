public class RotatedArray {
    public static void main(String[] args) {
        int [] arr = {15,20,50,1,2,3,5,6,7,9,10,11,12,13,14};
        int peak = search(arr);
        System.out.println(arr[peak]);
    }
    public static int search(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // finding peak value in given Rotated array. 
            if (arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]<arr[start])
            {
                end = mid-1;
            }
            else if (arr[mid]<arr[mid+1])
            {start = mid+1;
            }
        }
        return -1;
    }
}


