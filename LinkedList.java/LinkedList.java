public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        //step1 = create new node
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        //step2 = newnode cha next will point head
        newNode.next = head; //link
        //step3 = head->newNode
        head = newNode; 
    
        
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        //calculate size
       int sz = 0;
       Node temp = head;
       while(temp != null) {
        temp = temp.next;
        sz++;
       }

       if(sz == 1) {   //(sz == n) cos from last n is 1 from first
        head = head.next; //removeFirst
        return;
       }

       //sz-n(size-n)
       int i = 1;
       Node prev = head;
       while(i < sz-n) {
        prev = prev.next;
        i++;
       }
       prev.next = prev.next.next;
       return;

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        // ll.reverse();
        // ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();

    }

    
}
