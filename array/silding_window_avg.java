public class silding_window_avg {
    public static  double findMaxAverage(int[] nums, int k) {
     
      int sum=0;
      for(int i=0;i<k;i++){
        sum+=nums[i];
      }  
      int Maxsum=sum;
      for(int i=k;i<nums.length;i++){
        sum-=nums[i-k];
        sum+=nums[i];
        Maxsum=Math.max(Maxsum, sum);
      }
      return (double) Maxsum/k;
    }
    public static void main(String[] args) {
        int nums[]={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, 4));
    }
}
