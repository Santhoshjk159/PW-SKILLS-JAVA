import java.util.HashMap;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        int flag=0;
        for (int i = 0; i < n; i++) {
            if(hm.containsKey(arr[i])){
                flag=1;
                break;

            }
            else{
                hm.put(arr[i],1);
            }    
        }
        if (flag==0){
            System.out.println("No duplicate elements");
        }
        else{
            System.out.println("Contains duplicate elements");
        }
    }
}
