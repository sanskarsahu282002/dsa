import java.util.Scanner;
public class efflcm{
    public static int calclcm(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else{
            return calclcm(b,a%b);
        }
    }
    public static int lcm(int a,int b)
    {
        return a*b/calclcm(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter the b");
        int b=sc.nextInt();
        calclcm(a, b); 
        lcm(a, b);
        System.out.println(calclcm(a, b));
        System.out.println(lcm(a, b));
    }
}