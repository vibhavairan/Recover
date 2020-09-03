import com.sun.management.VMOption;

import java.util.Scanner;

public class BinaryTree {
    Scanner scn = new Scanner(System.in);

    private class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public BinaryTree() {
        this.root = takeInput(null, false);
    }

    private Node takeInput(Node parent, boolean ilc) {

        // prompt
        if (parent == null) {
            System.out.println("Enter the data for root node");
        } else {

            if (ilc) {
                System.out.println("Enter the data for left child of " + parent.data);
            } else {
                System.out.println("Enter the data for right child of " + parent.data);
            }
        }

        // take input of data from user
        int item = scn.nextInt();

        // create a new node
        Node nn = new Node();

        // update the data of node
        nn.data = item;

        // ask user if the node has left child
        System.out.println(nn.data + " has left child ?");

        // take input either true or false
        boolean hlc = scn.nextBoolean();

        // if left child exists, then create it
        if (hlc) {
            nn.left = takeInput(nn, true);
        }

        // ask user if the node has right child
        System.out.println(nn.data + " has right child ?");

        // take input either true or false
        boolean hrc = scn.nextBoolean();

        // if right child exists, then create it
        if (hrc) {
            nn.right = takeInput(nn, false);
        }

        // node is ready, now return the node
        return nn;
    }

    public void display(){
        display(this.root);
    }

    public void display(Node n){
        if(n==null)
            return;
        String res="";
        if(n.left!=null)
            res+=n.left.data;
        else
            res+=".";
        res+="->"+n.data+"<-";
        if(n.right!=null)
            res+=n.right.data;
        else
            res+=".";
        System.out.println(res);
        display(n.left);
        display(n.right);
    }

    public int size(){
        return size(this.root);
    }

    public int size(Node n){
        if(n==null)
            return 0;
        int ch=0;
        ch +=size(n.left);
        ch +=size(n.right);
        return ch+1;
    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.display();
        System.out.println(tree.size());
    }
}
