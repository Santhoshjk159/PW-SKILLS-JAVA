public class Q4{
    public static int ArrayMax2(int arr[])
    {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i]>max){
                max=arr[i];
            }

        }
        int max2=arr[0];
        for (int i = 0; i < arr.length; i++) 
        {
            if ((arr[i]>max2) && (arr[i]<max))
            {
                max2=arr[i];
                max=max2;
        
            }

        }
        return max;
        
        
    }
    public static void main(String[] args) 
    {
        int arr1[]={34,21,54,65,43};
        int arr2[]={4,3,6,7,1};
        int res1=ArrayMax2(arr1);
        int res2=ArrayMax2(arr2);
        System.out.println("The second maximum element is "+res1);
        System.out.println("The second maximum element is "+res2); 
    }

    private static void and(boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
        

            
        
    

    

    
}