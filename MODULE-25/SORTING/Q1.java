import java.util.Arrays;

public class Q1{
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swap=false;
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]<arr[j+1]){
                    //swapping
                    swap=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
            if (!swap){
                break;
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

