import java.util.Scanner;

public class Q1 {
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
        int pn = 0, nn = 0, on = 0, en = 0, ze = 0;

        for (int i = 0; i < m; i++) {
            for (int j=0;j<n;j++){
                if (arr[i][j]>0){
                    pn+=1;
                }
                else if (arr[i][j]<0){
                    nn+=1;
                }
                else{
                    ze+=1;
                }

    
            }
        }
            for (int i = 0; i < m; i++) {
                for (int j=0;j<n;j++){
                    if ((arr[i][j]%2==0) || (arr[i][j]==0)){
                        en+=1;
                    }
                     else{
                        on+=1;
                    }
                    
        
                }
            }
        System.out.println("number of positive numbers "+pn);
        System.out.println("number of negative numbers "+nn);
        System.out.println("number of odd numbers "+ on);
        System.out.println("number of even numbers "+ en);
        System.out.println("number of zeroes "+ ze);



           

        

    }
    
    
}
