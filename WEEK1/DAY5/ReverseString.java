public class ReverseString {
    public static void reverseString(char[] s) {
        int first = 0 , last = s.length-1;
        while(first<last){
            char temp = s[last];
            s[last]  = s[first];
            s[first] = temp;
              first++;
        last--;
        }
      
        
    }
    public static void main(String[] args) {
         char[] s = {'h','e','l','l','o'};
          reverseString(s);
          System.out.println(s);
    }
}
