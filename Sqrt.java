import java.util.Scanner;

public class Sqrt {


        public static void main (String args[])
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number to find Square root");
            int target = in.nextInt();
            int sqrtroot = rootSquare(target);
            System.out.println("square root of given number is "+sqrtroot);
        }

        public static int rootSquare(int target )
        {
            int start = 0;
            int end = target;
            int ans = 0;
            while(start < end )
            {
                int mid = start+(end - start )/2;
                int sqr = mid*mid;
                if(sqr==target)
                {
                    return mid;
                }
                else if (sqr < target)
                {
                    start = mid+1;
                    ans = start;
                }else if (sqr > target)
                {
                    end = mid-1;
                }
            }
            return ans;
        }

    }

