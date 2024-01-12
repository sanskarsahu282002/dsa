import java.util.Scanner;
public class pow_of_2 {
public static boolean isPow(int n)
    {
        if(n==0)
        {
            return false;
        }
        while(n!=1)
        {
            if(n%2!=0)
            {
                return false;
            }
            n=n/2;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println(isPow(n));
    }
}
