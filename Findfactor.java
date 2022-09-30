public class Findfactor {
    public static void main(String[] args) {
        int num = 81;
        Factor(num);
    }
    public static void Factor(int num){
        System.out.println("factor of given number is ");
        for (int i = 1 ; i<=num;i++)
        {
            if (num%i==0){
                System.out.println(+i);
            }
        }
    }
    }

