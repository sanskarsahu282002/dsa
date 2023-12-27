import java.util.Scanner;

public class chprime {
    public static void prime(int n)
    {
        if(n%n==0 && n%1==0)
        {
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        prime(n);
    }
}
