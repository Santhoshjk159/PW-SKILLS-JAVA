public class Q5{
    public static int Peak(int arr[])
    {
        int ans=-1;
        for (int i = 0; i < arr.length-1; i++) 
        {
            if (arr[i+1]>arr[i] && arr[i+1]>arr[i+2])
            {
                ans=arr[i+1];

            }
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int arr1[]={1,3,2,6,5};
        int arr2[]={1,4,7,3,2,8,5};
        int res1=Peak(arr1);
        int res2=Peak(arr2);
        System.out.println("The peak element is "+res1);
        System.out.println("The peak element is "+res2); 
    }
        

            
        
    

    

    
}