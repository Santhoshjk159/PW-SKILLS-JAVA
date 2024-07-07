import java.util.Arrays;

public class Q3{
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min_idx=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]>arr[min_idx]){
                    min_idx=j;

                }
            }
            if (min_idx!=i){
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
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

