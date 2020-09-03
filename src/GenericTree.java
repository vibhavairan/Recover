import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {
    Scanner scn = new Scanner(System.in);

    private class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    private Node root;

    public GenericTree() {

        root = construct(null, -1);
    }

    private Node construct(Node parent, int ith) {
        // prompt
        if (parent == null) {
            System.out.println("Enter the data for root node ?");
        } else {
            System.out.println("Enter the data for " + ith + " child of " + parent.data + " ?");
        }
        int item = scn.nextInt();
        Node nn = new Node();
        nn.data = item;
        // prompt
        System.out.println("Enter the number of children for " + nn.data + " ?");
        // take input for children
        int noc = scn.nextInt();
        // loop
        for (int j = 0; j < noc; j++) {

            Node child = construct(nn, j);
            nn.children.add(child);
        }
        return nn;
    }
    public int size(){
        return size(this.root);
    }
    public int size(Node n){
        int ss = n.children.size();
        for(Node child: n.children)
            ss = ss + size(child);
        return ss+1;
    }

    public int max(){
        return max(this.root);
    }
    public int max(Node n){
        int max = n.data;
        int maxChild = 0;
        for(Node child: n.children)
        {
         maxChild = max(child);
         if(maxChild>max)
             max = maxChild;
        }
        return max;
    }

    public void display(){
        display(this.root);
    }

    public void display(Node n){
        StringBuilder out = new StringBuilder(n.data + " ->");
        for(Node child : n.children)
            out.append(" ").append(child.data);
        out.append(".");
        System.out.println(out.toString());
        for(Node child : n.children)
            display(child);
    }

    public boolean find(int item){
        return find(this.root,item);
    }

    public boolean find(Node n,int item){
        if(n.data==item)
            return true;
        boolean bb=false;
        for(Node child : n.children)
            bb = find(child,item);
        return bb;
    }

    public int height(){
        return height(this.root);
    }

    public int height(Node n){
        int th = -1;
        for(Node child : n.children)
        {
            int ch = height(child);
            if(ch>th)
                th = ch;
        }
        return th+1;
    }

    public static void main(String[] args){
        GenericTree tree = new GenericTree();
        tree.display();
        System.out.println(tree.size()+1);
        System.out.println(tree.max());
        System.out.println(tree.find(4));
        System.out.println(tree.height());
    }
}
