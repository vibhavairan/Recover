class Node
{
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree {

    Node root;

    BinarySearchTree()
    {
        root = null;
    }
    void insert(int key)
    {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if(root == null)
        {
            root = new Node(key);
            return root;
        }
        if(key<root.key)
            root.left = insertRec(root.left,key);
        else
            root.right = insertRec(root.right,key);
        return root;
    }
    void inorder()
    {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if(root==null)
            return;
        inorderRec(root.left);
        System.out.print(root.key+" ");
        inorderRec(root.right);
    }

    private Node delete(Node root, int key){
        if(root==null)
            return root;
        else if(key<root.key)
            root.left = delete(root.left,key);
        else if(key>root.key)
            root.right = delete(root.right,key);
        else
        {
            if(root.left==null&&root.right==null)
            {
                root = null;
            }
            else if(root.left==null){
                root = root.right;
                return root;
            }
            else if(root.right==null){
                root = root.left;
            }
            else
            {
                Node temp = findMin(root.right);
                root.key = temp.key;
                root.right = delete(root.right,temp.key);
            }
        }
        return root;
    }

    private Node findMin(Node root) {
        if(root.left==null)
            return root;
        return findMin(root.left);
    }

    public static void main(String args[])
    {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(45);
        tree.insert(5);
        tree.insert(435);
        tree.insert(34);
        tree.insert(1);
        tree.insert(32);
        tree.insert(44);
        tree.inorder();
        System.out.println("");
        tree.delete(tree.root,5);
        tree.inorder();
    }
}
