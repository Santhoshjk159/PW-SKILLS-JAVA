import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of m");
        int m=sc.nextInt();
        System.out.println("enter value of n");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j=0;j<n;j++){
                System.out.println("Enter values");
                int k= sc.nextInt();
                arr[i][j]=k;
            }
        }
        System.out.println("diagonal elements:");
        for (int i = 0; i < m; i++) {
            for (int j=0;j<n;j++){
                if((i+j==arr.length-1) || (i==j)){
                    System.out.println(arr[i][j]);
                }
 

    
            }
        }


           

        

    }
    
    
}
