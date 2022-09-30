public class Indexvalue {
    public static void main (String[] args) {
        int[] arr = {15,2,45,12,7};
find(arr);
    }
public static void find(int[] arr){
        for (int i =0; i<arr.length;i++){
if(arr[i]==i+1)
                System.out.println(" the value equal to index value is " +arr[i]);
            }

}
}
