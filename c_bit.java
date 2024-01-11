import java.util.Scanner;

public class c_bit {
    public static  int calbit(int n)
    {
        int res=0;
        while(n>0)
        {
            if(n%2==1)
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
        int n = sc.nextInt();
        calbit(n);
        System.out.println("the number of bit"+calbit(n));
    }
}
