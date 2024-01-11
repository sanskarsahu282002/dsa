import java.util.Scanner;
public class count_bit {
    public static int calcount(int n)
    {
       int res=0;
       while(n>0)
       {
        if((n&1)!=0)
        {
            res++;
        }
        n=n/2;
       }
       return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        calcount(n);
        System.out.println(calcount(n));
    }
}
