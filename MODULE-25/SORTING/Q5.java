
public class Q5{
    public static int sort(int[] arr){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            int min_idx=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]>arr[min_idx]){
                    count+=1;
                    min_idx=j;

                }
            }
            if (min_idx!=i){
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }           
        }
    return count;
    }
    public static void main(String[] args) {
        int []arr={3,5,1,6,0};
        int count=sort(arr);
        System.out.println("The count is:"+count);
            
    }
}

