import java.util.Scanner;
public class cal_bit {
    public static int cal(int n)
    {
        int res=0;
        while(n>0)
        {
            res=res+(n&1);
            n=n/2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        cal(n);
        System.out.println("the count is"+cal(n));
    }
}
