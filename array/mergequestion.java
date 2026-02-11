class mergequestion{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int i=nums1.length-1;i>=m;i--){
        //     nums1[i]=nums2[]
        // }
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums1.length-1-i;j++){
        //         if(nums1[j]>nums1[j+1]){
        //             int temp=nums1[j+1];
        //             nums1[j+1]=nums1[j];
        //             nums1[j]=nums1[j+1];

        //         }
        //     }
        // }
    
    }
    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
       merge(nums1, 3, nums2, 3);

       for(int i : nums1){
        System.out.print(i+" ");
       }
       System.out.println();

        }
}