import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("No of elements in Array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter"+(i+1)+"th element");
            arr[i]=sc.nextInt();
        }
        for (int i : arr) {
            
        }
        System.out.println("Enter element to find");
        int x=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                System.out.println(i);
            }
            
        }
            
    }
}

