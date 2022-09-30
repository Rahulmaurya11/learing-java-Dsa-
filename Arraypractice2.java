public class Arraypractice2 {
    //Richest Customer Wealt
    // A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the
    // customer that has the maximum wealth.
    //Ex. Input: accounts = [[1,2,3],[3,2,1]]
    //Output: 6

    public static void main(String[] args) {
        int[][] wealth = {{1, 2, 3}, {3, 2, 1}};
        Calculate(wealth);

    }

    public static void Calculate(int[][] wealth) {
int ans =0;
for (int i = 0; i <wealth.length; i++) {
int sum = 0;

            for (int j = 0; j<wealth[i].length; j++) {
                System.out.println("welath[" + i + "]" + "welath[" + j + "]" + wealth[i][j]);
          sum+=wealth[i][j];

            }
if (sum>ans){
    ans = sum;
}
        }
        System.out.println("the max wealth is "+ans );
    }
}