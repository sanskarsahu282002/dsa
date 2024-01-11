
    import java.util.Scanner;

public class eff_kth_2 {
    public static int kth(int k,int n)
    {
        int x=(n>>(k-1));
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
        int n = sc.nextInt();
        System.out.println("Enter k: ");
        int k=sc.nextInt();
        kth(k, n);
        System.out.println(kth(k, n));
    }
}


