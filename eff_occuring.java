public class eff_occuring {
    public static int occ(int arr[])
    {
        int count=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr.length-1;j++)
         {
            if(arr[i]==arr[j])
            {
                count++;
            } 
         }
         if(count%2!=0)
         {
            return arr[i];
         }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={7,3,7,7,7};
        occ(arr);
        System.out.println(occ(arr));
    

    }
}
