import java.util.Scanner;

public class trilingzero {
    public static void trailfact1(int n)
    {
        int res=0;
        for(int i=5;i<=n;i=i*5)
        {
            res=res+n/i;
        }
        System.out.println(res);
    }
    public static void trailfact(int n)
    {
        int res=1;
        int countzero=0;
        for(int i=2;i<=n;i++)
        {
            res=res*i;
        }
        System.out.println(res);
        while(res%10==0)
        {
            countzero++;
            res=res/10;
        }
        System.out.println(countzero);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n");
        int n = sc.nextInt();
        trailfact(n);
        trailfact1(n);
    }
}
