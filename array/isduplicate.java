import java.util.HashMap;

class isduplicate{
        public  static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }else{
                hm.put(nums[i], 1);
            }
        }
        for(int k : hm.keySet()){
            if(hm.get(k)>1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,2};
        System.out.println(c);
    }
}