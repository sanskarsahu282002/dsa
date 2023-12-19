import java.util.Scanner;

public class gcd {
    public static void calgcd(int a,int b)
    {
        int res=Math.min(a,b);// 2,4 res is 2
        while(res>0)
        {
            if(a%res==0 && b%res==0)
            {
                break;
            }
            res--;
        }
     System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        calgcd(a, b);
    }
}
