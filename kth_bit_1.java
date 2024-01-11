import java.util.Scanner;
public class kth_bit_1 {
    public static int kth(int n,int k)
    {
        int x=1;
        for (int i = 0;i<(k-1);i++)
        {
            x=x*2;
        }
        if((n&x)!=0)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        return x;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    System.out.println("enter k");
    int k=sc.nextInt();
    kth(n, k);
    System.out.println(kth(n, k));
    }
}
