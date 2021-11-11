public class BST {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    Node root;
    BST(){
        root = null;
    }

    void insert(int item){
        root = insertRec(root,item);
    }

    Node insertRec(Node root, int item){
        if(root == null)
        {
            root = new Node(item);
            return root;
        }
        else if(item<root.data)
            root.left = insertRec(root.left,item);
        else
            root.right = insertRec(root.right,item);
        return root;
    }

    void inorder(){
        inorderRec(root);
    }

    void inorderRec(Node root){
        if(root == null)
            return;
        inorderRec(root.left);
        System.out.print(root.data+" ");
        inorderRec(root.right);
    }

    void delete(int item){
        root = deleteNode(root, item);
    }

    Node deleteNode(Node root, int item){
        if(root==null)
            return root;
        else if(root.data>item)
            root.left = deleteNode(root.left,item);
        else if(root.data<item)
            root.right = deleteNode(root.right,item);
        else
        {
            if(root.left==null&&root.right==null)
            {
                root = null;
            }
            else if(root.left==null)
            {
                root = root.right;
            }
            else if(root.right==null)
            {
                root = root.left;
            }
            else {
                Node temp = getSmallest(root.right);
                root.data = temp.data;
                root.right = deleteNode(root.right,temp.data);
            }
        }
        return root;
    }

    private Node getSmallest(Node root) {
        if(root.left==null)
            return root;
        return getSmallest(root.left);
    }

    public static void main(String[] args){
        BST a = new BST();
        a.insert(7);
        a.insert(1);
        a.insert(9);
        a.insert(2);
        a.insert(10);
        a.inorder();
        System.out.println("");
        a.delete(9);
        a.inorder();
        a.delete(1);
        System.out.println("");
        a.inorder();
    }
}
