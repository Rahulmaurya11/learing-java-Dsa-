public class Arraypractice1 {

    //Return the running sum of nums.
    //given array is num= {1,2,3,4}
    public static void main(String[] args) {
        int[] num = {1,2,3,4,};
        Runningsum(num);

    }
    public static void Runningsum(int[] num){

        for(int i=1;i<num.length;i++){

                num[i]+=num[i-1];

        }

        for(int j=0;j<num.length;j++){
            System.out.print(num[j]+",");
        }
    }
}
