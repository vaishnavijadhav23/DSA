import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class string {
    public static String Unique(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            Character ch = str.charAt(i);
        
            if(s.empty()) {
                s.push(ch);
            } else if  (s.peek() == ch) 
                    s.pop();    
              else{
                s.push(ch);
            }    
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()) {
          
            sb.append(s.pop());   
        }
        String ans =  sb.reverse().toString();
        if(ans.isEmpty()){
            return "Empty String";
        }  
        return ans;  
    } 
     public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        int Total_pairs = 0;
        if(n == 0)
        return Total_pairs;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            if(!set.contains(ar.get(i))) {
                set.add(ar.get(i));
            } else {
                Total_pairs++;
                set.remove(ar.get(i));
            }
        }
        return Total_pairs;

    }

    public static void main(String[] args) {
        String str = "aabaddabcd";
        int[] ar = {1, 2, 1,2,1,3,2};
        //System.out.println(Unique(str));  
        System.out.println(sockMerchant(0, null));
    }    
}
