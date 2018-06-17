//Kth Ancestor in a tree
import java.util.*;
class Node{
  int key;
  Node left, right;
  Node(int key){
    this.key = key;
    this.left = this.right = null;
  }
}
class BinaryTree{
  Node root;
  BinaryTree(int key){
    this.root = new Node(key);
  }
  public static void main(String[] args){
    BinaryTree bt = new BinaryTree(1);
    bt.root.left = new Node(2);
    bt.root.right = new Node(3);
    bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(5);
    bt.root.right.left = new Node(6);
    bt.root.right.right = new Node(7);
    bt.root.left.left.right = new Node(8);
    System.out.println(bt.kAncestor(bt.root, 2, 8));
  }
    public int kAncestor(Node node, int k, int data){
      if(node == null)
        return -1;
      if(node.key == data)
        return 1;
      int lval = kAncestor(node.left, k, data);
      int rval = kAncestor(node.right, k , data);
      if(lval == k || rval == k){
        System.out.println(node.key);
      }
      if(lval != -1 || rval != -1){
        return lval + rval + 1 + 1; //One plus 1 to nullify -1 in either lval or rval
      }
      return -1;
    }

}
