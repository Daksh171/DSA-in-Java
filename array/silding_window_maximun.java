public class silding_window_maximun {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int result[]= new int[nums.length-k+1];
        for(int i=0;i<=nums.length-k;i++){
            int max = nums[i];
            for(int j=i;j<i+k;j++){
                max=Math.max(max, nums[j]);
            }
            result[i]=max;
        }
        return result;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={7,2,4};
        int k=2;
       
      print( maxSlidingWindow(nums, k));
    }
}
