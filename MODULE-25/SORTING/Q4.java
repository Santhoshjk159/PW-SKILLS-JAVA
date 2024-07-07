
public class Q4{
    public static int sort(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            boolean swap=false;
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]<arr[j+1]){
                    //swapping
                    swap=true;
                    count+=1;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
            if (!swap){
                break;
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

