import java.util.Scanner;

public class Q5{
    public static Boolean square(int num) {
        long low = 0;
        long high =num/2;
        if (num==1) {
            return true;
        }

        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid*mid == num) {
                return true;
            } else if (mid*mid < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num=sc.nextInt();
        Boolean res = square(num);
        if (res == false) {
            System.out.println("Not a Perfect Square");
        } else {
            System.out.println("It is a perfect square ");
        }

        sc.close();  
    }
}
