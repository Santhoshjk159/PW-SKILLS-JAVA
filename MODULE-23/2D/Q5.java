import java.util.ArrayList;
import java.util.Scanner;


public class Q5 {
    public static ArrayList Matrices(int arr[][]){
        int m=arr.length;
        ArrayList al=new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j=0;j<m;j++){
                try {
                    if ((i==(m-1)/2)||(j==(m-1)/2)){
                        al.add(arr[i][j]);
                    }
                
                    
                } catch (Exception e) {
                    System.out.println("Error");
                }                   

            }
        }
        return al;
    }
    

        

        

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
        ArrayList res1=Matrices(arr);

        System.out.println(res1);
        }


           

        

    }

    
    

