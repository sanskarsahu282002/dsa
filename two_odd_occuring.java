public class two_odd_occuring {
    public static int two_occuring(int arr[],int x)
    {

        for(int i=0;i<arr.length;i++)
        {
             x = arr[0];
        }
        int k = ( x&(~(x-1)));
        int res1=0;
        int res2=0;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]&k)!=0)
            {
                res1= res1^arr[i];
            }
            else{
                res2= res2^arr[i];
            }   
            return res1+res2;         
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(two_occuring(arr, 0));

    }
}
