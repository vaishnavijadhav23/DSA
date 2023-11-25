import java.util.Stack;

public class PushAtBottom {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void revverseStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        revverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int i=0;
        while(i < str.length()) {
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder str1 = new StringBuilder();
        while(!s.isEmpty()) {
            char curr = s.pop();
            str1.append(curr);
        }

        return str1.toString();
    }
    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s, 4);
        // while(!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }

         String str = "abc";
        // String str1 = reverseString(str);
        System.out.println(reverseString(str));

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        //printStack(s);
        revverseStack(s);
        printStack(s);
        

    }
    
}
