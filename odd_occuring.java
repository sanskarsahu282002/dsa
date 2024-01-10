public class odd_occuring {
    public static int occuring(int num[])
    {
       int count2=0;
        for(int i=0;i<=num.length-1;i++)
        {
            
         for(int j=1;j<=num.length-1;j++)
         {
            if(num[i]==num[j])
            {
                count2++;
            }
         }
         if(count2%2!=0)
         {
            System.out.println(num[i]);
         }
        }
        return count2;
    }
    public static void main(String[] args) {
     int num[]={2,5,4,5,2};
     occuring(num);
     System.out.println("the occuring of 2 is"+occuring(num));

    }
}
