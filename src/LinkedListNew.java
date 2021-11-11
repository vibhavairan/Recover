public class LinkedListNew {
    class Node{
        int data;
        Node next;
        Node(int key){
            data = key;
            next = null;
        }
    }

    Node head;

    LinkedListNew(){
        head = null;
    }

    void insert(int key)
    {
        head = insertNode(key,head);
    }

    void display(){
        displayList(head);
    }

    Node reversee(Node head){
        if(head==null)
            return head;
        else
        {
            Node prev, curr, next;
            prev = null;
            curr = head;
            while (curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
            return head;
        }
    }

    Node insertNode(int data, Node head){
        if(head==null)
        {
            head = new Node(data);
            return head;
        }
        Node temp = head;
        while (temp.next!=null)
            temp = temp.next;
        temp.next = new Node(data);
        return head;
    }

    void displayList(Node head)
    {
        while (head!=null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    void reverse(){
        head = reverseList(head);
        display();
    }
//     head             head
//     34 -> 56 -> 54 -> 5
//        <-

    Node reverseList(Node head){
        if(head == null)
            return head;
        else {
            Node prev, curr, next;
            prev = null;
            curr = head;
            while (curr!=null)
            {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
    }

    void middle(){
        System.out.println(middleElement(head).data);
    }
    Node middleElement(Node head){
        if(head==null)
            return null;
        Node slow, fast;
        slow = head;
        fast = head;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args){
        LinkedListNew a = new LinkedListNew();
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert(5);
        a.insert(6);
        a.insert(7);
        a.display();
        System.out.println(" ");
        a.reverse();
        System.out.println("");
        a.middle();

    }
}
