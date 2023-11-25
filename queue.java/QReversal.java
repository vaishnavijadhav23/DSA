import java.util.*;
public class QReversal {
    public static void main(String[] args) {
        Queue<Integer> q = (Queue<Integer>)new LinkedList();
        Stack<Integer> s = new Stack<>();
        for(int i=1; i<=5; i++) {
            q.add(i);
        }
        while (!q.isEmpty()) {
           s.push(q.remove());           
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
            System.out.print(q.peek()+" ");
            q.remove();
            
        }       
    }   
}
