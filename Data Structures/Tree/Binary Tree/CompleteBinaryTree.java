//Check if tree is complete Binary tree
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
    //bt.root.left.left.right = new Node(8);
    if(bt.isCompleteBT(bt.root))
      System.out.println("Complete");
    else
      System.out.println("Incomplete");
  }
  boolean isCompleteBT(Node root)
    {
          if(root == null){
            return true;
          }
        if(root.left == null && root.right != null){
            return false;
        }
        return isCompleteBT(root.left) && isCompleteBT(root.right);
	}

}
