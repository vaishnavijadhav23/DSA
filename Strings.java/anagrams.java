import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str1 ="earth";
        String str2 = "HearT";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()) {
            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);
            boolean result = Arrays.equals(s1,s2);
            if(result) {
                System.out.println("anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
           
        } else{
            System.out.println("Not Anagrams");
        }
         
    }
    
}
