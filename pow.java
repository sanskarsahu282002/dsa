import java.util.Scanner;

public class pow {
    public static int calpow(int x,int n)
    {
        if(n==0)
        return 1;
        int temp=calpow(x, n/2);
        temp=temp*temp;
        if(n%2==0)
        return temp;
        else
        return temp*x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x");
        int x= sc.nextInt();
        System.out.println("enter n");
        int n = sc.nextInt();
        calpow(x, n);
        System.out.println("the value is"+calpow(x, n));
    }
}
