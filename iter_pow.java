import java.util.Scanner;

public class iter_pow {
    public static int calcpow(int x,int n)
    {
        int res=1;
        while(n>0)
        {
            if(n%2!=0)
            res=res*x;
            x=x*x;
            n=n/2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x");
        int x= sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        calcpow(x, n);
        System.out.println("the value"+calcpow(x, n));
    }
}
