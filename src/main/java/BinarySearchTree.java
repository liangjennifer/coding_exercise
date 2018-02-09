/**
 * Created by jliang1 on 2/4/18.
 */
public class BinarySearchTree {


    class Node {
        Node left;
        Node right;
        Integer key;

        Node(Integer a) {
            key = a;
        }
    }

    Node root = null;

    public Node insertA(Node n, Integer a) {
        if (n == null) {
            n = new Node(a);
            return n;
        }

        if (a > n.key)
            n.right = insertA(n.right, a);
        else
            n.left = insertA(n.left, a);

        return n;



    }



    public void insert(Integer a) {

       root = insertA(root, a);

    }

    public void print() {
        printTree(root);
    }

    public void printTree(Node n) {
        if (n != null) {
            printTree(n.left);
            System.out.println(n.key);
            printTree(n.right);

        }
    }

    public static void main(String[] arg) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(600);
        bst.insert(60);
        bst.insert(44);
        bst.insert(23);
        bst.insert(1);
        bst.insert(90);
        bst.insert(800);
         bst.insert(50);
        bst. insert(59);

        bst.print();
    }
}
