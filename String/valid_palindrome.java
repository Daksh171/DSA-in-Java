package String;

public class valid_palindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder("");
        
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                s1.append(Character.toLowerCase(s.charAt(i)));
            }     
        }

        int n = s1.length();
       for(int i=0;i<n/2;i++){
        if(s1.charAt(i)!=s1.charAt(n-i-1)){
            return false;
        }
       } 
       return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        
      
    }
     
}