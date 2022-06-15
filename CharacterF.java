public class CharacterF {

    public static void main(String[] args) {
        char [] character = {'j','k','l','m'};
        char target = 'm';
        char ans = Search(character,target);
        System.out.println(ans);
    }
    public static char Search(char[] arr, char target){
    int start = 0;
    int end = arr.length-1;
    int n = arr.length;

        while (start <= end )
    {
        int mid = start + (end-start)/2;
        if (arr[mid]>target)
        {
            end = mid-1;

        }
        else
        {
            start = mid + 1;

        }

    }
        return arr[start % n];
}

}
