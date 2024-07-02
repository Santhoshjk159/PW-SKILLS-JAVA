import java.util.Scanner;

public class Q4 {
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
        int max=arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j=0;j<n;j++){
                if (arr[i][j]>max){
                    max=arr[i][j];
                }


                }
 

    
            }
        System.out.println("biggest element in 2D-Array is "+max);
        }


           

        

    }
    
    

