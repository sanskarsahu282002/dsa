import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  the number n");
        int n = sc.nextInt();
        int rev=0;
        int temp=n;
        while(temp!=0)
        {
            int ld=temp%10;
            rev=rev*10+ld;
            temp=temp/10;
        }
        if(rev==n)
        {
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not a plaindrome number");
        }
    }
}
