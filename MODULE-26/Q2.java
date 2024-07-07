import java.util.Scanner;

public class Q2{
    public static int altsum(int n){
    if(n==0){
        return 0;
    }
    else{
        if (n%2==0){
            return altsum(n-1)-n;
        }
        else{
            return altsum(n-1)+n;
        }
    }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int res=altsum(n);
        System.out.println("Alternate Sum of digit of "+n+" is "+res);
        
    }
}