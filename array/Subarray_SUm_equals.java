public class Subarray_SUm_equals {
    public  static int subarraySum(int[] nums, int k) {
       int prefix[]= new int [nums.length];
       int curr =0;
       int ans=0;
       prefix[0]=nums[0];
       for(int i=1;i<nums.length;i++){
        prefix[i]=prefix[i-1]+nums[i];
       }
       for(int i=0;i<nums.length;i++){
        int start=i;
        for(int j=i;j<nums.length;j++){
          int end=j;
          curr = start ==0 ? prefix[end]:prefix[end]-prefix[start-1];
          if(curr ==k){
            ans++;
          }     
        }
      }
      return ans;

    }
    public static void main(String[] args) {
       int nums[]={1,1,1};
       int k=2;
       System.out.println(subarraySum(nums, k));
    }
}
