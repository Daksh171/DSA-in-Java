public class substring_maxvowels {
    public static int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
        }
        int Maxcount=count;
        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i-k))){
                count--;
            }
            if(isvowel(s.charAt(i))){
                count++;
            }
            Maxcount=Math.max(Maxcount, count);
        }
        return Maxcount;
    }
    public static boolean isvowel(char s){
        if(s=='a' || s=='e'|| s=='i'|| s=='o'|| s=='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s= "leetcode";
        int k=2;
        System.out.println(maxVowels(s, k));
    }
}
