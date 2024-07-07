import java.util.Scanner;

public class Q5 {
    public static int Powofelem(int a, int b){
        if (b==0){return 1;}
        else if (b%2==0){
            return Powofelem(a, b/2)*Powofelem(a, b/2);
        }
        else{
            return a*Powofelem(a, b/2)*Powofelem(a, b/2);
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check:");
        int a = sc.nextInt();
        int b=
        
    }  
}
