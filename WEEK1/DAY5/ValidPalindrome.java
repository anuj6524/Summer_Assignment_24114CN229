public class ValidPalindrome {
     public static boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = result.length();
        for(int i = 0;i<n/2;i++){
            if(result.charAt(i) != result.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
      String  s = "race a car";
      System.out.println(isPalindrome(s));
    }
}
