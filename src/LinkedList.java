public class LinkedList<I extends Number> {
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public void display()
    {
        Node temp = this.head;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Size: "+this.size);
        System.out.println("Head: "+this.head);
        System.out.println("Tail: "+this.tail);
    }

    public void addLast(int item){
        Node nn = new Node(item);
        if(this.size>0){
            this.tail.next = nn;
        }
        else
        {
            this.head = nn;
        }
        this.tail = nn;
        this.size++;
    }

    public void addFirst(int item){
        Node nn = new Node(item);
        if(this.size>0){
            nn.next = this.head;
            this.head = nn;
        }
        else
        {
            this.head = nn;
            this.tail = nn;
        }
        this.size++;

    }

    public int getFirst(){
        if(this.size==0){
            System.out.println("underflow");
            return -1;
        }
        else
        {
            return this.head.data;
        }
    }

    public int getLast(){
        if(this.size==0){
            System.out.println("underflow");
            return -1;
        }
        else
        {
            return this.tail.data;
        }
    }

    public int getAt(int idx){
        if(this.size==0)
        {
            System.out.println("Underflow");
            return -1;
        }
        else if(idx<0||idx>=this.size){
            System.out.println("Wrong Index");
            return -1;
        }
        else
        {
            Node temp = this.head;
            for(int x=0;x<idx;x++)
                temp = temp.next;
            return temp.data;
        }
    }

    private Node getNodeAt(int idx){
        if(this.size==0)
        {
            System.out.println("Underflow");
            return null;
        }
        else if(idx<0||idx>=this.size){
            System.out.println("Wrong Index");
            return null;
        }
        else
        {
            Node temp = this.head;
            for(int x=0;x<idx;x++)
                temp = temp.next;
            return temp;
        }
    }

    public void addAt(int idx, int item){
        if(idx<0||idx>this.size){
            System.out.println("Wrong Index");
            return;
        }
        else if(idx==0)
            this.addFirst(item);
        else if(idx==this.size)
            this.addLast(item);
        else
        {
            Node nn = new Node(item);
            Node temp = this.head;
            for(int i=0;i<idx-1;i++)
                temp = temp.next;
            nn.next = temp.next;
            temp.next = nn;
            this.size++;
        }
    }

    private Node reverse(){
        Node curr = this.head;
        Node nxt;
        Node prev = null;
        while (curr!=null)
        {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    public static void main(String[] args)
    {
        LinkedList<Number> list = new LinkedList<Number>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addFirst(5);
        list.display();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getAt(2));
        System.out.println(list.getNodeAt(2).data);
        list.addAt(2,-5);
        list.display();
        list.head = list.reverse();
        list.display();
    }
}
