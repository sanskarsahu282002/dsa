import java.util.Scanner;

public class euclid_alogo {
    public static int euclid(int a,int b)
    {
        // while(a!=b)
        // {
        //     if(a>b)
        //     {
        //         a=a-b;
        //         System.out.println(a);
        //     }
        //     else{
        //         b=b-a;
        //         System.out.println(b);
        //
        if(b==0)
        {
            return a;
        }
        else{
            return euclid(b,a%b);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a= sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        int c=euclid(a, b);
        System.out.println(c);
        

    }
}
