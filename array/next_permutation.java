import java.util.*;

class next_permutation{
    public static void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
        }
        reverse(nums, i+1, nums.length-1);
    }
    public static void reverse(int nums[],int start,int end){
        while(start<end){
            int temp= nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;

        }
    }
    public static void main(String[] args) {
        int nums[]={1,3,5,4,2};
       
       
        nextPermutation(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

    }
}