//Check if tree is perfect Binary tree
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
    //bt.root.left.right.right = new Node(9);
    System.out.println(bt.isPerfectBT(bt.root));
    int level = bt.level(bt.root, 0);
    if(bt.isPerfectBT(bt.root) == Math.pow(2, level) - 1)
      System.out.println("Full");
    else
      System.out.println("Not Full");
  }
  int isPerfectBT(Node root){
    if(root == null)
      return 0;
    return isPerfectBT(root.left) + isPerfectBT(root.right) + 1;
	}
  int level(Node node, int level){
    if(node == null)
      return level;
    return level(node.left, level + 1);
  }

}
