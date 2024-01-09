import java.util.Scanner;

public class coumpte_pow {
    public static int calpow(int n,int x)
    {
        int value=1;
       for(int i=1;i<=n;i++)
       {
        value=value*x;
       }
       return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x");
        int x=sc.nextInt();
        System.out.println("enter n");
        int n=sc.nextInt();
        calpow(n,x);
        System.out.println("the value is");
        System.out.println(calpow(n, x));
    }
    
}
