import java.util.Scanner;

public class badver {
    public static void main (String args[])
    {
        System.out.println("bad version programme, these all are version in production ");
        int [] arr = {121,122,123,124,125,126,127,128,129,130,144,145,146,147};
        for (int i =0;i<arr.length;i++ )
        {
            System.out.print(arr[i]+" ,");
        }
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("enter first bad version ");
        int target = in.nextInt();
        int ans = badBs(arr,target);
        System.out.println("first bad version is "+ans);
        allBadver(arr,ans);


    }
    public static void allBadver(int [] arr, int ans){
        System.out.println("these all version are bad versions :");
        for (int i = ans; i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static int badBs(int [] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while (start < end)
        {
            int mid = start+(end-start)/2;
            if (target == arr[mid])
            {
                return mid;
            }else if (target>arr[mid]){
             start = mid+1;
        }else if(target<arr[mid]){
                end = mid-1;
        }
        }

        return -1;
    }
}
