import java.util.*;
class LogestSubstring{
    public static  int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int left =0;
        int maxlength=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                left = Math.max(left,hm.get(ch)+1);
            }
            hm.put(ch,i);
            maxlength = Math.max(maxlength,i-left+1);
        }
        return maxlength;

    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aba"));
    }
}