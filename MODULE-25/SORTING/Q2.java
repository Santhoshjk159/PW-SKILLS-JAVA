import java.util.Arrays;

public class Q2{
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            while ((j>0) && (arr[j]>arr[j-1])){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;

            }
            
        }
    }
    public static void main(String[] args) {
        int []arr={3,5,1,6,0};
        sort(arr);
        System.out.println("The Sorted array is");
        System.out.println(Arrays.toString(arr));
            
    }
}

