//array concatenation without using any inbuilt functions.
public class Arrconcat {
    public static void main(String[] args) {
        int [] num = {1,2,1};
        //creating array variable of double size
        int [] result = new int[num.length*2];
        for(int i = 0;i<num.length;i++)
        {
            result[i]=num[i];
            System.out.print(result[i]+" ");
        }

        for( int j=num.length,i=0;j<result.length && i<num.length;j++,i++)
        {
            result[j]=num[i];
            System.out.print(result[i]+" ");
        }
    }
}
