public class product_self {
    public  static int[] productExceptSelf(int[] nums) {
       int ans[] = new int[nums.length]; 
       int maxproduct=1;
       int index;
        for(int i=0;i<nums.length;i++){
          maxproduct*=nums[i];
          if(maxproduct==0){
            index=i;
           int max=1;
            for(int j=0;j<nums.length;j++){
                if(index!=j){
                    max*=nums[j];
                }
                    
                
            }
            
             ans[index]=max;
             return ans;
          }
        }
        

        for(int i=0;i<nums.length;i++){
            
            ans[i]=maxproduct/nums[i];
        }

        return ans;
    } 
    public static int product(int []nums,int index){
        int curr=1;
        for(int i=0;i<nums.length;i++){
            if(i!=index){
                curr*=nums[i];
            }
        }

        return curr;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int nums[]={0,0};
        print(productExceptSelf(nums));
       
       

    }
}
