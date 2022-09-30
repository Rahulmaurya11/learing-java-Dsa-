import java.util.Arrays;
//finding  first and last occurance of given target .
// solving by brute force approch.
public class firstlastsearch {
    public static void main(String[] args) {
        int [] arr= {1,23,5,5,5,5,67,123,125};
        int target = 5;
        search(arr,target);
    }

    public static void search(int[] arr,int target)
    {
       int first= findfirst(arr,target);
       int last = lastocc(arr,target);
        int [] firstlastoccurance = {first,last};
        System.out.println(Arrays.toString(firstlastoccurance));
    }

    public static int  findfirst (int [] arr, int target ){
        for (int i =0; i<arr.length-1;i++)
        {
            if (arr[i]==target){
                return i;
            }
        }
    return -1;}

    public static int lastocc (int [] arr, int target ){
        for (int i =arr.length-1; i>0;i--)
        {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
