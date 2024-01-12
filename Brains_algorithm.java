import java.util.Scanner;

public class Brains_algorithm {
    public static int cal_bit(int n )
    {
        int res=0;
        while(n>0)
        {
            n=n&(n-1);
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        cal_bit(n);
        System.out.println(cal_bit(n));

    }
}
