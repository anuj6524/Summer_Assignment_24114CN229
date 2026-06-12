import java.util.Arrays;

public class ValidAnagram{
      public static boolean isAnagram(String s, String t) {
         s = s.toLowerCase();
        t = t.toLowerCase();
        char [] schararray = s.toCharArray();
        char [] tchararray = t.toCharArray();
        Arrays.sort(schararray);
         Arrays.sort(tchararray);
         boolean result = Arrays.equals(schararray,tchararray);
         if(result){
            return true;
         }
return false;

    }
    public static void main(String[] args) {
        String s = "anagram";
         String t =  "nagaram";
        System.out.println(isAnagram(s,t));
    }
}