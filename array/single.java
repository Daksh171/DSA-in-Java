import java.util.*;
class single{
    public  static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], 1);
            }else{
                hm.put(nums[i], hm.get(nums[i])+1);
            }
        }    

        for( int k : hm.keySet()){
            if(hm.get(k)==1){
                return k;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,2,1};
        System.out.println(singleNumber(nums));
    }
}