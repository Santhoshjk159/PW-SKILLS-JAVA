public class Q1{
    public static int EvenSum(int arr[])
    {
        int sum=0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (i%2==0){
                sum+=arr[i];

            }
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        int arr1[]={3,20,4,6,9};
        int arr2[]={4,3,6,7,1};
        int res1=EvenSum(arr1);
        int res2=EvenSum(arr2);
        System.out.println("The sum of even indices is "+res1);
        System.out.println("The sum of even indices is "+res2); 
    }
        

            
        
    

    

    
}