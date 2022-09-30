import java.util.Arrays;

public class Sortingpractice1 {
    public static void main(String[] args) {
        int[] num = {-4,-1,0,3,10};
        System.out.println("given array :              "+Arrays.toString(num));
        Arraysquare(num);
        System.out.println("square of arrays element : "+Arrays.toString(num));
        sortit(num);
        System.out.println("sorted afer square  :      "+Arrays.toString(num));
    }
    public static void Arraysquare(int[] num){
        for(int i = 0 ; i<num.length;i++){
            num[i]=num[i]*num[i];
        }
    }
    public static void sortit(int[] num){
        for(int i =0;i<num.length;i++){
            for(int j =1;j<num.length;j++){

                if(num[j]<num[j-1]){
                    swap(num,j,j-1);
                }
            }
        }

    }
    public static void swap(int[]num,int first, int second){
        int temp = num[first];
        num[first]=num[second];
        num[second]=temp;
    }
}

