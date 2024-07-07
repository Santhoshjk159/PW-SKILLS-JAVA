import java.util.Scanner;

public class Q2{
    public static int bin(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int res=-1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                low=mid+1;//extra line for highest index 
                res=mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements in Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + "th element:");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter element to find:");
        int target = sc.nextInt();
        
        int res = bin(arr, target);
        
        if (res == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Found at highest index " + res);
        }

        sc.close();  
    }
}
