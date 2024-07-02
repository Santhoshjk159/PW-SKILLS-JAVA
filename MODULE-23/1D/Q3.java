public class Q3{
    public static int ArrayMax(int arr[])
    {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i]>max){
                max=arr[i];
            }

        } 
        return max;
        
        
    }
    public static void main(String[] args) 
    {
        int arr1[]={3,20,4,6,9};
        int arr2[]={4,3,6,7,1};
        int res1=ArrayMax(arr1);
        int res2=ArrayMax(arr2);
        System.out.println("The maximum element is "+res1);
        System.out.println("The maximum element is "+res2); 
    }
        

            
        
    

    

    
}