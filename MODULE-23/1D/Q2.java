import java.util.ArrayList;

public class Q2{
    public static ArrayList EvenArray(int arr[])
    {
        ArrayList al=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i]%2==0){
                al.add(arr[i]);
                

            }
        }
        return al;
    }
    public static void main(String[] args) 
    {
        int arr1[]={34,21,54,65,43};
        int arr2[]={4,3,6,7,1};
        ArrayList res1=EvenArray(arr1);
        ArrayList res2=EvenArray(arr2);
        System.out.println("The even elements in array are"+res1);
        System.out.println("The even elements in array are"+res2); 
    }
        

            
        
    

    

    
}