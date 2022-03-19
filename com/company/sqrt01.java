package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class sqrt01 {
    public static void main(String args[]){
 Scanner in = new Scanner(System.in);
        System.out.println("enter a number to find Square root.");
        int target = in.nextInt();
        int ans = rootNum(target);
        System.out.println("square root of give number is "+ans);
    }
public static int rootNum(int target)
{
    int start = 0;
    int end = target;
    int ans=0;
    while (start <= end)
    {
        int mid = start+(end - start)/2;
int sqr = mid*mid;
        if (sqr == target)
        {
            return mid;
        }
        else if (sqr<target){
            start= mid+1;
            ans = start-1;
        }else if (sqr>target){
            end = mid-1;

        }
    }
    return ans;
}
}