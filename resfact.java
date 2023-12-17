import java.util.Scanner;

public class resfact {
    public static void resfact(int n)
    {
        int res=1;
        if(n==0)
        {
             System.out.println("1");
        }
            System.out.print(res=n*resfact(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n");
        int n=sc.nextInt();
        resfact(n);
    }
}
